package pages.testimonials;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import utils.ElementUtils;

public class SimulationAndModellingPage extends AbstractPage<SimulationAndModellingPage> {
    @FindBy(xpath = "//h2[text() = 'Testimonials - Simulation and Modelling']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
