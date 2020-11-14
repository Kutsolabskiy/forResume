package pages.homePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.IFrame;
import utils.ElementUtils;

import java.util.Objects;

public class HomePageNumberGeneratorComponent extends IFrame {

    @FindBy(id = "true-random-integer-generator-min")
    private WebElement minField;

    @FindBy(id = "true-random-integer-generator-max")
    private WebElement maxField;

    @FindBy(id = "true-random-integer-generator-button")
    private WebElement generateButton;

    @FindBy(id = "true-random-integer-generator-result")
    private WebElement resultElement;

    public HomePageNumberGeneratorComponent(WebElement frameElement){
        super (frameElement);
    }

    public void  generateNumber(int min, int max) {
        this.perform(() -> {
            if (Objects.nonNull(min)) {
                ElementUtils.setValue(minField, String.valueOf(min));
            }

            if (Objects.nonNull(max)) {
                ElementUtils.setValue(maxField, String.valueOf(max));
            }

            generateButton.click();
        });
    }

    public void  generateNumber(long min, long max) {
        this.perform(() -> {
            if (Objects.nonNull(min)) {
                ElementUtils.setValue(minField, String.valueOf(min));
            }

            if (Objects.nonNull(max)) {
                ElementUtils.setValue(maxField, String.valueOf(max));
            }

            generateButton.click();
        });
    }

    public Integer getGeneratedNumber(){
        String result = this.perform(() -> resultElement.getText());

        if (result.matches("[-]?\\d+")) {
            return Integer.parseInt(result);
        } else {
            return null;
        }
    }

    public String getGeneratedStringElement(){
        return this.perform(() -> resultElement.getText());
    }





}
