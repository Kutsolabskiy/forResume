package pages.integers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;
import utils.WaitUtils;

public class DecimalFractionNumberPage extends AbstractPage<DecimalFractionNumberPage> {

    @FindBy(xpath = "//h2[text() = 'Random Decimal Fraction Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
