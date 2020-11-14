package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class AudioNoiseGeneratorPage extends AbstractPage<AudioNoiseGeneratorPage> {
    @FindBy(xpath = "//h2[text() = 'Random Audio Noise Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
