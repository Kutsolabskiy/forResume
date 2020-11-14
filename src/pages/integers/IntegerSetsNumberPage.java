package pages.integers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class IntegerSetsNumberPage extends AbstractPage <IntegerSetsNumberPage> {
    @FindBy(xpath = "//h2[text() = 'Random Integer Set Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
