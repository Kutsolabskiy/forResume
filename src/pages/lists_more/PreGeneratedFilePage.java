package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class PreGeneratedFilePage extends AbstractPage<PreGeneratedFilePage> {
    @FindBy(xpath = "//h1[text() = 'Pregenerated File Archive ']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
