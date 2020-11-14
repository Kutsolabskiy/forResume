package pages.learnMore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class FAQ_Page_LearnMore extends AbstractPage<FAQ_Page_LearnMore> {

    @FindBy(xpath = "//h2[text() = 'Frequently Asked Questions (FAQ)']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
