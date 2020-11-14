package pages.drawings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class HowPickWinnerPage extends AbstractPage<HowPickWinnerPage> {
    @FindBy(name = "Q3.1")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}

