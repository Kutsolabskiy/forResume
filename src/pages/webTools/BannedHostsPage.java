package pages.webTools;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class BannedHostsPage extends AbstractPage<BannedHostsPage> {
    @FindBy(xpath = "//h2[text() = 'List of Banned Hosts']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}