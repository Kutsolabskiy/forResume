package pages.games;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.NavigationPage;
import utils.ElementUtils;

public class BirdieFundRandomizerGamePage extends NavigationPage<BirdieFundRandomizerGamePage> {

    @FindBy(xpath = "//h2[text() = 'Birdie Fund Randomizer']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
