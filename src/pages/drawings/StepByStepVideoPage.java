package pages.drawings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class StepByStepVideoPage extends AbstractPage<StepByStepVideoPage> {
    @FindBy(xpath = "//h2[text() = 'Video Tutorial #1 – Blog and Business Giveaways']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}