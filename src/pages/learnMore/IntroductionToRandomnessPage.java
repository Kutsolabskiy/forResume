package pages.learnMore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class IntroductionToRandomnessPage extends AbstractPage<IntroductionToRandomnessPage> {
    @FindBy(xpath = "//h2[text() = 'Introduction to Randomness and Random Numbers']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}