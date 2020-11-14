package pages.integers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class RawBytesNumbersPage extends AbstractPage<RawBytesNumbersPage> {
    @FindBy(xpath = "//h2[text() = 'Random Byte Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
