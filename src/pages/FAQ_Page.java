package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ElementUtils;

public class FAQ_Page extends AbstractPage<FAQ_Page> {
    @FindBy(css = "//h2[text() = 'Frequently Asked Questions (FAQ)']")
    WebElement pageHeadingElement;

    @FindBy(name = "Q3.1")  ////"a[@name = "Q3.1"]"
    WebElement pageQ3_1;


    @Override
    public boolean isLoaded() {
        return ElementUtils.isNotDisplayed(pageHeadingElement);
    }
}
