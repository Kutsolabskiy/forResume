package pages.homePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.NavigationPage;
import pages.PagePath;
import utils.ElementUtils;

@PagePath("")
public class HomePage extends NavigationPage<HomePage> {

    @FindBy(id = "homepage-generator")
    private WebElement wideColumn;

    @FindBy(tagName = "RANDOM.ORG - True Random Number Service")
    private WebElement title;

    @FindBy(css = "iframe")
    private WebElement generatorFrame;

    @FindBy(id = "true-random-integer-generator-min")
    private WebElement minField;

    @FindBy(id = "true-random-integer-generator-max")
    private WebElement maxField;

    @FindBy(id = "true-random-integer-generator-button")
    private WebElement generateButton;

    @FindBy(name = "q")
    private static WebElement searchField;

    @FindBy(css = "input[value='Search']")
    private static WebElement searchButton;

    @FindBy()
    private WebElement homeButton;

    @FindBy()
    private WebElement gamesDropDownMenu;

    @FindBy()
    private WebElement numbersDropDownMenu;

    @FindBy()
    private WebElement list_moreDropDownMenu;

    @FindBy()
    private WebElement drawingsDropDownMenu;

    @FindBy()
    private WebElement web_toolsDropDownMenu;

    @FindBy()
    private WebElement statisticsDropDownMenu;

    @FindBy()
    private WebElement testimonialsDropDownMenu;

    @FindBy()
    private WebElement learn_mareDropDownMenu;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(wideColumn);
    }

    public HomePage generateNumber(Integer min, Integer max) {
        getElementGenerator().generateNumber(min, max);
        return this;
    }

    public HomePage generateNumber(Long min, Long max) {
        getElementGenerator().generateNumber(min, max);
        return this;
    }

    public void setSearchField(String searchText){
        ElementUtils.setValue(searchField, searchText);
        ElementUtils.clickToElement(searchButton);
    }

    private HomePageNumberGeneratorComponent getElementGenerator(){
        return new HomePageNumberGeneratorComponent(generatorFrame);
    }

    public Integer getGeneratedNumber(){
        return getElementGenerator().getGeneratedNumber();
    }

    public String getGeneratedMassage(){
        return getElementGenerator().getGeneratedStringElement();
    }

}
