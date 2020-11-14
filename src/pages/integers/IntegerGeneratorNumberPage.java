package pages.integers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;
import pages.PagePath;
import utils.DriverProvider;
import utils.ElementUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@PagePath("/integers/")
public class IntegerGeneratorNumberPage extends AbstractPage<IntegerGeneratorNumberPage> {

    @FindBy(xpath = "//h2[text() = 'Random Integer Generator']")
    private WebElement pageHeadingElement;

    @FindBy(name = "num")
    private WebElement numbersCountField;

    @FindBy(name = "min")
    private WebElement minField;

    @FindBy(name = "max")
    private WebElement maxField;

    @FindBy(name = "col")
    private WebElement rowSizeField;

    @FindBy(css = "input[value='Get Numbers']")
    private WebElement get_numbersButton;

    @FindBy(css = "input[value='Reset Form']")
    private WebElement reset_formButton;

    @FindBy(css = "input[value='Switch to Advanced Mode']")
    private WebElement advanced_modeButton;

    @FindBy(css = "input[value='16']")
    private WebElement hexadecimalRadioButton;

    @FindBy(css = "input[value='10']")
    private WebElement decimalRadioButton;

    @FindBy(css = "input[value='8']")
    private WebElement octalRadioButton;

    @FindBy(css = "input[value='2']")
    private WebElement binaryRadioButton;

    @FindBy(xpath = "//p[text() = 'How do you want the integers to be shown?']//input[@value='html']")
    private WebElement onNicelyFormattedWebPageRadioButton;

    @FindBy(xpath = "//p[text() = 'How do you want the integers to be shown?']//input[@value='plain']")
    private WebElement asBare_BonesTextDocumentPageRadioButton;

    @FindBy(xpath = "//input[@type='radio'][@name='rnd'][1]")
    private WebElement generateYourOwnPersonalRandomizationRightNowRadioButton;

    @FindBy(xpath = "//input[@type='radio'][@name='rnd'][2]")
    private WebElement usePregeneratedRandomizationFromRadioButton;

    @FindBy(xpath = "//input[@type='radio'][@name='rnd'][3]")
    private WebElement usePregeneratedRandomizationBasedOnPersistentIdentifierRadioButton;

    @FindBy(css = "pre.data")
    private WebElement dataContainer;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }

    public IntegerGeneratorNumberPage setIntegersForSimpleTest(int numbersCount, int min, int max, int rowSize){
        IntegerGeneratorNumberPage page = setIntegersSimpleTest(numbersCount, min, max, rowSize);
        page.clickGetNumbersButton();
        return page;
    }

    public IntegerGeneratorNumberPage setIntegersForResetSimpleTest(int numbersCount, int min, int max, int rowSize){
        IntegerGeneratorNumberPage page = setIntegersSimpleTest(numbersCount, min, max, rowSize);
        page.clickToButtonResetForm();
        return page;
    }

    public IntegerGeneratorNumberPage setIntegersForAdvancedTest(int numbersCount, int min, int max, int rowSize, String numeralSystem, String outputFormat, String randomization){
        IntegerGeneratorNumberPage page = setIntegersAdvancedTest(numbersCount, min, max, rowSize, numeralSystem, outputFormat, randomization);
        clickGetNumbersButton();
        return page;
    }

    private IntegerGeneratorNumberPage setIntegersSimpleTest(int numbersCount, int min, int max, int rowSize){

        ElementUtils.setValue(numbersCountField, String.valueOf(numbersCount));

        ElementUtils.setValue(minField, String.valueOf(min));

        ElementUtils.setValue(maxField, String.valueOf(max));

        ElementUtils.setValue(rowSizeField, String.valueOf(rowSize));

        return this;
    }

    private IntegerGeneratorNumberPage setIntegersAdvancedTest(int numbersCount, int min, int max, int rowSize, String numeralSystem, String outputFormat, String randomization){

        advanced_modeButton.click();

        ElementUtils.setValue(numbersCountField, String.valueOf(numbersCount));

        ElementUtils.setValue(minField, String.valueOf(min));

        ElementUtils.setValue(maxField, String.valueOf(max));

        ElementUtils.setValue(rowSizeField, String.valueOf(rowSize));

        getCheckBoxesElements(numeralSystem).click();

        getCheckBoxesElements(outputFormat).click();

        getCheckBoxesElements(randomization).click();

        return this;
    }

    public List<List<Integer>> getResults() {
        String rawData = ElementUtils.getText(dataContainer);

        return Stream.of(rawData.split("\n"))
                .map(rawRow -> Stream.of(rawRow.trim().split("\\s"))
                        .map(Integer::parseInt).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    private void clickToButtonResetForm(){
        reset_formButton.click();
    }

    private void clickGetNumbersButton (){
        get_numbersButton.click();
    }

    private WebElement getCheckBoxesElements (String nameKey){
        Map<String, WebElement> checkBoxes = new HashMap<>();
        checkBoxes.put("Hexadecimal", hexadecimalRadioButton);
        checkBoxes.put("Decimal", decimalRadioButton);
        checkBoxes.put("Octal", octalRadioButton);
        checkBoxes.put("Binary", binaryRadioButton);
        checkBoxes.put("On a nicely formatted web page", onNicelyFormattedWebPageRadioButton);
        checkBoxes.put("As a bare-bones text document", asBare_BonesTextDocumentPageRadioButton);
        checkBoxes.put("Generate your own personal randomization right now", generateYourOwnPersonalRandomizationRightNowRadioButton);
        checkBoxes.put("Use pregenerated randomization from", usePregeneratedRandomizationFromRadioButton);
        checkBoxes.put("Use pregenerated randomization based on persistent identifier", usePregeneratedRandomizationBasedOnPersistentIdentifierRadioButton);

        return checkBoxes.get(nameKey);
    }


}
