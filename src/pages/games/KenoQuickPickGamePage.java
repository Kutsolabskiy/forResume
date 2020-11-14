package pages.games;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.NavigationPage;
import utils.ElementUtils;

public class KenoQuickPickGamePage extends NavigationPage<KenoQuickPickGamePage> {
    @FindBy(xpath = "//h2[text() = 'Keno Quick Pick']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
