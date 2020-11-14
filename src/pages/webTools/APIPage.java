package pages.webTools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class APIPage extends AbstractPage<APIPage> {

    @FindBy(xpath = "//h1[text() = 'API Dashboard ']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}