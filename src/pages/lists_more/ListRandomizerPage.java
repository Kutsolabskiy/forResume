package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PagePath;
import pages.components.NavigationPage;
import utils.ElementUtils;


@PagePath("/lists")
public class ListRandomizerPage extends NavigationPage<ListRandomizerPage> {



    @FindBy(xpath = "//h2[text() = 'List Randomizer']")
    private WebElement pageHeadingElement;

    @FindBy(css = "[name='list']")
    private WebElement inputList;

    @FindBy(css = "[value='Randomize']")
    private WebElement randomizeButton;

    @FindBy(xpath = "//div[@id='invisible']/ol")
    private WebElement dataContainer;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }

    public ListRandomizerPage getRow(String row){

        ElementUtils.setValue(inputList, String.valueOf(row));

        randomizeButton.click();
        return this;
    }

    public String getResults() {
        return ElementUtils.getText(dataContainer);
    }
}
