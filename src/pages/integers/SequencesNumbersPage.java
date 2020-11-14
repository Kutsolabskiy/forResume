package pages.integers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class SequencesNumbersPage extends AbstractPage<SequencesNumbersPage> {
    @FindBy(xpath = "//h2[text() = 'Random Sequence Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
