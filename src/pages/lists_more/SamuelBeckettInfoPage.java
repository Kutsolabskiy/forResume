package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class SamuelBeckettInfoPage extends AbstractPage<SamuelBeckettInfoPage> {
    @FindBy(xpath = "//h1[text() = 'Possible Lessnesses']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
