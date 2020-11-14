package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class ColorGeneratorPage extends AbstractPage<ColorGeneratorPage> {
    @FindBy(xpath = "//h1[text() = 'Random Hex Color Code Generator ']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
