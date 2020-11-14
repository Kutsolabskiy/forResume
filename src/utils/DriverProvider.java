package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class DriverProvider {

    public static final ThreadLocal<WebDriver> DRIVER_HOLDER = new ThreadLocal<>();

    public static WebDriver start(Browser browser){
        Objects.requireNonNull(browser, "Browser should be defined");
        switch (browser) {
            case CHROME:
                return createChrome();
            case FIREFOX:
                return createFireFox();
        }
        return null;
    }

    public static void releaseCurrentDriver() {
        Optional.ofNullable(DRIVER_HOLDER.get())
                .ifPresent(driver -> {
                    driver.quit();
                    DRIVER_HOLDER.set(null);
                });
    }

    private static WebDriver createChrome(){
        String path = Paths.get("src", "main", "resources", "selenium", "drivers", "chromedriver.exe").toString();
        System.setProperty("webdriver.chrome.driver", path);

        WebDriver driver = new ChromeDriver();
        DRIVER_HOLDER.set(driver);
        return driver;
    }

    private static WebDriver createFireFox() {
        return null;
    }

    public static WebDriver getCurrentDriver() {
        return Optional.ofNullable(DRIVER_HOLDER.get())
                .orElseThrow(() -> new NoSuchElementException(
                        "No driver initialized for thread: " + Thread.currentThread()));
    }

}
