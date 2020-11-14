package pages.drawings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class ThirdPartyDrawServicePage extends AbstractPage<ThirdPartyDrawServicePage> {
    @FindBy(xpath = "//h2[text() = 'Third-Party Draw Service']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}