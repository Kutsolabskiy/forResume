package pages.integers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class GaussianNumberPage extends AbstractPage<GaussianNumberPage> {
    @FindBy(xpath = "//h2[text() = 'Gaussian Random Number Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
