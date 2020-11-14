package pages.testimonials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class MiscellaneousPage extends AbstractPage<MiscellaneousPage> {
    @FindBy(xpath = "//h2[text() = 'Testimonials - Miscellaneous']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
