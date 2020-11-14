package pages.webTools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class Old_API_Page extends AbstractPage<Old_API_Page> {
    @FindBy(xpath = "//h2[text() = 'HTTP Interface Description']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
