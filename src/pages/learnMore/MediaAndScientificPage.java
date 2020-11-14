package pages.learnMore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class MediaAndScientificPage extends AbstractPage<MediaAndScientificPage> {
    @FindBy(xpath = "//h2[text() = 'Media Coverage and Citations']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}