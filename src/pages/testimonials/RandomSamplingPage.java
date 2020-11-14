package pages.testimonials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class RandomSamplingPage extends AbstractPage<RandomSamplingPage> {
    @FindBy(xpath = "//h2[text() = 'Testimonials - Random Sampling']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
