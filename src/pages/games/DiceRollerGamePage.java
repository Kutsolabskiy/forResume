package pages.games;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.NavigationPage;
import utils.ElementUtils;

public class DiceRollerGamePage extends NavigationPage<DiceRollerGamePage> {
    @FindBy(xpath = "//h2[text() = 'Dice Roller']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
