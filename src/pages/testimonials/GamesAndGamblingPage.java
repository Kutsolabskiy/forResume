package pages.testimonials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class GamesAndGamblingPage extends AbstractPage<GamesAndGamblingPage> {
    @FindBy(xpath = "//h2[text() = 'Testimonials - Games and Gambling']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}

