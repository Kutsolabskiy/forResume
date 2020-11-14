package pages.testimonials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class SecurityPage extends AbstractPage<SecurityPage> {
    @FindBy(xpath = "//h2[text() = 'Testimonials - Security']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
