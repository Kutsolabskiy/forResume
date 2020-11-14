package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class JazzGeneratorPage extends AbstractPage<JazzGeneratorPage> {
    @FindBy(xpath = "//h2[text() = 'Random Jazz Scale Generator']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
