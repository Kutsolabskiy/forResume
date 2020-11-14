package pages.learnMore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class AcknowledgementsPage extends AbstractPage<AcknowledgementsPage> {
    @FindBy(xpath = "//h2[text() = 'List of Helpful Individuals']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}