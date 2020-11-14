package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverProvider;
import utils.WaitUtils;

public abstract class AbstractPage <T extends AbstractPage<T>> implements Loadable{
    private static final String BASE_URL = "https://random.org/";

    public AbstractPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public T get() {
        loadPage();

        return (T) WaitUtils.waitUntilLoaded(this);

    }

    protected void loadPage() {
        String url = getBaseUrl() + getPath();
        getDriver().get(url);
    }

    public String getBaseUrl(){
        return BASE_URL;
    }

    private String getPath(){
        return this.getClass().getAnnotation(PagePath.class).value();
    }

    protected WebDriver getDriver() {
        return DriverProvider.getCurrentDriver();
    }

}
