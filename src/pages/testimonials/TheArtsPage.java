package pages.testimonials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class TheArtsPage extends AbstractPage<TheArtsPage> {
    @FindBy(xpath = "//h2[text() = 'Testimonials - The Arts']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
