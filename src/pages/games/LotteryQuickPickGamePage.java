package pages.games;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.NavigationPage;
import utils.ElementUtils;

public class LotteryQuickPickGamePage extends NavigationPage<LotteryQuickPickGamePage> {


    @FindBy(xpath = "//h2[text() = 'Lottery Quick Pick']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
