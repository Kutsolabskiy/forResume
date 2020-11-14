package pages.learnMore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class TermsAndConditionsPageLearnMore extends AbstractPage<TermsAndConditionsPageLearnMore> {
    @FindBy(xpath = "//h2[text() = 'Terms and Conditions']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}