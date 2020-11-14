package pages.statistics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class TestingRandomNumbersPage extends AbstractPage<TestingRandomNumbersPage> {
    @FindBy(xpath = "//h2[text() = 'Statistical Analysis']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
