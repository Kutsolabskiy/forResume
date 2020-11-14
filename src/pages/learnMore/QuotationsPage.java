package pages.learnMore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class QuotationsPage extends AbstractPage<QuotationsPage> {
    @FindBy(xpath = "//h2[text() = 'Quotations about Randomness']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}