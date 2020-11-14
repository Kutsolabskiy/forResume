package pages.lists_more;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PagePath;
import pages.components.NavigationPage;
import utils.ElementUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    @PagePath("/passwords")
    public class PasswordsGeneratorPage extends NavigationPage<PasswordsGeneratorPage> {

        @FindBy(xpath = "//h2[text() = 'Random Password Generator']")
        private WebElement pageHeadingElement;

        @FindBy(name = "num")
        private WebElement numField;

        @FindBy(name = "len")
        private WebElement lenField;

        @FindBy(xpath = "//input[@value = 'Get Passwords']")
        private WebElement getPasswordsButton;

        @FindBy(xpath = "//ul[@class = 'data']")
        private WebElement dataContainer;

        @Override
        public boolean isLoaded() {
            return ElementUtils.isDisplayed(pageHeadingElement);
        }

        public PasswordsGeneratorPage getInteger(int num, int len){

            ElementUtils.setValue(numField, String.valueOf(num));

            ElementUtils.setValue(lenField, String.valueOf(len));

            getPasswordsButton.click();
            return this;
        }

        public List<String> getResult(){
            String rawData = ElementUtils.getText(dataContainer);

            return Stream.of(rawData.split("\n")).collect(Collectors.toList());


        }
    }
