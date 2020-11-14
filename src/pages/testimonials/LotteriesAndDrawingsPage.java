package pages.testimonials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class LotteriesAndDrawingsPage extends AbstractPage<LotteriesAndDrawingsPage> {
    @FindBy(xpath = "//h2[text() = 'Testimonials - Lotteries and Draws']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
