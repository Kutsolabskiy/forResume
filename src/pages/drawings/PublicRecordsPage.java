package pages.drawings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class PublicRecordsPage extends AbstractPage<PublicRecordsPage> {
    @FindBy(xpath = "//h2[text() = 'Third-Party Draw Service – Public Records']")
    WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}