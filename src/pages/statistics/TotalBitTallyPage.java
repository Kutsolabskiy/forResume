package pages.statistics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class TotalBitTallyPage extends AbstractPage<TotalBitTallyPage> {
    @FindBy(xpath = "//h2[text() = 'Bit Tally']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
