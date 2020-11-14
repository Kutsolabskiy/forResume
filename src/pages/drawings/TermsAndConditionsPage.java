package pages.drawings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class TermsAndConditionsPage extends AbstractPage<TermsAndConditionsPage> {
    @FindBy(xpath = "//h2[text() = 'Third-Party Draw Service – Description']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}