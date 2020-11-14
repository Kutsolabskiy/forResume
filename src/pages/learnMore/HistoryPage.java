package pages.learnMore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class HistoryPage extends AbstractPage<HistoryPage> {
    @FindBy(xpath = "//h2[text() = 'The History of RANDOM.ORG']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}