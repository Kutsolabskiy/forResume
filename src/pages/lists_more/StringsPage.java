package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class StringsPage extends AbstractPage<StringsPage> {
    @FindBy(xpath = "//h2[text() = 'Random String Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
