package pages.statistics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class RealTimeStatisticsPage extends AbstractPage<RealTimeStatisticsPage> {
    @FindBy(xpath = "//h2[text() = 'Real-Time Statistics']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}

