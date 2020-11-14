package pages.components;

import dataNavigation.NavigationItem;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.DriverProvider;
import utils.ElementUtils;
import utils.WaitUtils;

import java.util.Objects;

public class NavigateComponent extends AbstractComponent {

    @FindBy(css = "ul")
    private WebElement listElement;

    public NavigateComponent(WebElement baseElement) {
        super(baseElement);
    }

    private void openNavigation(){
        ElementUtils.mouseOver(this.getWrappedElement());
        WaitUtils.waitForElement(listElement, ElementUtils::isDisplayed);
    }

    private void clickItem(NavigationItem item){
        By contextXpath = By.xpath(String.format(".//a[@href][text() = \"%s\"]", item.getName()));
        WebElement targetItem = getWrappedElement().findElement(contextXpath);
        targetItem.click();
        WaitUtils.waitForElement(targetItem, ElementUtils::isNotDisplayed);
    }

    public void navigate(NavigationItem item){
        findDropDownElement();
        clickItem(item);
    }

    private void findDropDownElement() {
        openNavigation();
        WebDriver driver = DriverProvider.getCurrentDriver();
        try {
            driver.findElement(By.xpath((".//li/ul[contains(@style,'display: block;')]")));
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Not found dropDown navigation element");
            System.out.println("СОСИ!"); // Remove before realise
            Assert.fail();
        }

        }

}
