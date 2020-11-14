package pages.webTools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class OldGuidelinesPage extends AbstractPage<OldGuidelinesPage> {
    @FindBy(xpath = "//h2[text() = 'Automated Clients']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}