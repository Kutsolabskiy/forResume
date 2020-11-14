package pages.drawings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class PriceCalculatorPage extends AbstractPage<PriceCalculatorPage> {
    @FindBy(xpath = "//h2[text() = 'Third-Party Draw Service – Price Calculator']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}