package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class GeographicCoordinatesPage extends AbstractPage<GeographicCoordinatesPage> {
    @FindBy(xpath = "//h2[text() = 'Random Geographic Coordinates']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
