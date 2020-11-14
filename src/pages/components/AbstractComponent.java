package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import pages.Loadable;
import utils.ElementUtils;

public class AbstractComponent implements Loadable, WrapsElement {

    private final WebElement baseElement;

    public AbstractComponent(WebElement baseElement){
        PageFactory.initElements(new DefaultElementLocatorFactory(baseElement), this);
        this.baseElement = baseElement; //Max said rewrite
    }

    @Override
    public WebElement getWrappedElement() {
        return baseElement;
    }

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(baseElement);
    }
}
