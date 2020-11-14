package pages.statistics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class GraphBrowserPage extends AbstractPage<GraphBrowserPage> {
    @FindBy(xpath = "//h2[text() = 'Statistics Browser']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
