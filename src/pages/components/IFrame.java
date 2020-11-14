package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.DataProviderHolder;
import org.testng.annotations.DataProvider;
import utils.DriverProvider;

import java.util.function.Supplier;

public class IFrame {

    private final WebElement frameElement;

    public IFrame(WebElement frameElement){
        PageFactory.initElements(DriverProvider.getCurrentDriver(), this);
        this.frameElement = frameElement;
    }

    protected <T> T perform(Supplier<T> resultSupplier) {      //perform = выполнять  //Supplier = поставщик
        WebDriver driver = DriverProvider.getCurrentDriver();
        driver.switchTo().frame(frameElement);

        try{
            return resultSupplier.get();
        }finally {
            driver.switchTo().defaultContent();
        }
    }

    protected void perform(Runnable runnable){
        WebDriver driver = DriverProvider.getCurrentDriver();
        driver.switchTo().frame(frameElement);
        try{
            runnable.run();
        }finally {
            driver.switchTo().defaultContent();
        }
    }
}
