package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;
import pages.components.NavigateComponent;

import javax.swing.*;

public class ElementUtils {

    public static void setValue(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    public static void clickToElement(WebElement element){
        element.click();
    }

    public static String getText(WebElement element){
        return element.getText();
    }

    public static void windowMoveBack(){
        WebDriver driver = DriverProvider.getCurrentDriver();
        driver.navigate().back();
    }

    public static Integer getIntegerValueFromCurrentElementFromHisName(String name){
        return Integer.parseInt(DriverProvider.getCurrentDriver().findElement(By.xpath(String.format("//input[@name = '%s']", name))).getAttribute("value"));
    }

    public static boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public static boolean isNotDisplayed(WebElement element) {
        try {
            return !element.isDisplayed();
        }catch (NoSuchElementException | StaleElementReferenceException e){
            return true;
        }
    }

    public static void mouseOver(WebElement element){
        new Actions(DriverProvider.getCurrentDriver()).moveToElement(element).perform();
    }
}
