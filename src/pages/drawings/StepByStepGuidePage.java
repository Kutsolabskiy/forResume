package pages.drawings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class StepByStepGuidePage extends AbstractPage<StepByStepGuidePage> {
    @FindBy(xpath = "//h2[text() = 'Guide to Random Drawings']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}