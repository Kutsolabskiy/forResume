package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class ClockTimeGeneratorPage extends AbstractPage<ClockTimeGeneratorPage> {
    @FindBy(xpath = "//h2[text() = 'Random Clock Time Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
