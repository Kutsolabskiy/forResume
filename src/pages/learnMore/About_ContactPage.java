package pages.learnMore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class About_ContactPage extends AbstractPage<About_ContactPage> {
    @FindBy(xpath = "//h2[text() = 'About RANDOM.ORG']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}