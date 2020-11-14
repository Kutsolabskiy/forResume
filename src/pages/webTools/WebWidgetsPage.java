package pages.webTools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class WebWidgetsPage extends AbstractPage<WebWidgetsPage> {

    @FindBy(xpath = "//h2[text() = 'Web Widgets']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
