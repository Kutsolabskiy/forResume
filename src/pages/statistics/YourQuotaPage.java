package pages.statistics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class YourQuotaPage extends AbstractPage<YourQuotaPage> {
    @FindBy(xpath = "//h2[text() = 'Your Quota']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
