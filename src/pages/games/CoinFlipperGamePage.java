package pages.games;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.NavigationPage;
import utils.ElementUtils;

public class CoinFlipperGamePage extends NavigationPage<CoinFlipperGamePage> {
    @FindBy(xpath = "//h2[text() = 'Coin Flipper']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
