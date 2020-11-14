package tests.essential;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.homePages.HomePage;
import tests.AbstractTest;
import utils.DriverProvider;
import utils.WaitUtils;

import java.util.ArrayList;

public class HomePageTest extends AbstractTest {

    @Test
    public void testVerifyTitleOnHomePage(){

        HomePage homePage = new HomePage().get();
        verifyTitle();
    }

    @Test(dataProvider = "minMaxTest")
    public void testHomepageRandomGeneratorForm(int min, int max){

        HomePage homepage = new HomePage().get().generateNumber(min, max);

        verifyGeneratedNumber(homepage, min, max);
    }

    @Test(dataProvider = "validPositiveData")
    public void testVerifyValidCalculationsOnTrueRandomNumberGeneratorWithValidData(int min, int max){

        HomePage homePage = new HomePage().get().generateNumber(min, max);

        verifyGeneratedNumber(homePage, min, max);
    }

    @Test(dataProvider = "validNegativeData")
    public void testVerifyValidCalculationsOnTrueRandomNumberGeneratorWithValidNegativeData(int min, int max){

        HomePage homePage = new HomePage().get().generateNumber(min, max);

        verifyGeneratedNumber(homePage, min, max);
    }

    @Test(dataProvider = "validNegativeAndPositiveData")
    public void testVerifyValidCalculationsOnTrueRandomNumberGeneratorWithValidNegativeAndPositiveData(int min, int max){

        HomePage homePage = new HomePage().get().generateNumber(min, max);

        verifyGeneratedNumber(homePage, min, max);
    }

    @Test(dataProvider = "moreThenMaximumData")
    public void testVerifyErrorMessageIsDisplayedOnTrueRandomNumberGeneratorWithValueMoreThenMaximum(long min, long max){

        HomePage homePage = new HomePage().get().generateNumber(min, max);

        verifyErrorMessageWithValueMoreThenMaximum(homePage);

    }

    @Test(dataProvider = "lessThenMinimumData")
    public void testVerifyErrorMessageIsDisplayedOnTrueRandomNumberGeneratorWithValueLessThenMinimum(long min, long max){

        HomePage homePage = new HomePage().get().generateNumber(min, max);

        verifyErrorMessageWithValueLessThenMinimum(homePage);
    }

    @Test(dataProvider = "forSearchFieldData")
    public void testTransitionToSearchServiceDuckduckgo(String text){

        HomePage homePage = new HomePage().get();

        verifyTransitionToSearchServiceDuckduckgo(homePage, text);
    }

    public void verifyTransitionToSearchServiceDuckduckgo(HomePage page, String text){
        String expectedTitle = String.format("%s site:random.org at DuckDuckGo", text);
        page.setSearchField(text);

        WebDriver driver = DriverProvider.getCurrentDriver();

        ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));

        Assert.assertEquals(driver.getTitle(), expectedTitle);
        driver.close();
        driver.switchTo().window(list.get(0));
    }

    public void verifyTitle(){
        String receivedTitle = DriverProvider.getCurrentDriver().getTitle();
        String expectedTitle = "RANDOM.ORG - True Random Number Service";
        Assert.assertEquals(receivedTitle, expectedTitle);
    }


    public void verifyGeneratedNumber(HomePage page, int min, int max){
        WaitUtils.waitAsserted(() -> {
            Integer result = page.getGeneratedNumber();
            Assert.assertNotNull(result, "Result should be not null");
            String massage = String.format("Result should be in limits: min = '%s' and max = '%s'", min, max);
            Assert.assertTrue((result <= max && result >= min), massage);
        });
    }

    public void verifyErrorMessageWithValueMoreThenMaximum(HomePage page){
        WaitUtils.waitAsserted(() -> {
            String result = page.getGeneratedMassage();
            String expectedResult = "Error: The maximum value must be an integer in the [-1000000000,1000000000] interval";
            Assert.assertEquals(result, expectedResult);
        });

    }

    @DataProvider
    public static Object[][] moreThenMaximumData(){
        return new Object[][]{
                {10L, 10000000000L}
        };
    }

    public void verifyErrorMessageWithValueLessThenMinimum(HomePage page){
        WaitUtils.waitAsserted(() -> {
            String result = page.getGeneratedMassage();
            String expectedResult = "Error: The minimum value must be an integer in the [-1000000000,1000000000] interval";
            Assert.assertEquals(result, expectedResult);
        });
    }

    @DataProvider
    public static Object[][] lessThenMinimumData(){
        return new Object[][]{
                {-10000000000L, 10L}
        };
    }

    @DataProvider
    private static Object[][] minMaxTest() {
        return new Object[][]{
                {1, 10},
                {10, 100},
                {100, 10000}
        };
    }

    @DataProvider
    private static Object[][] validPositiveData() {
        return new Object[][]{
                {5, 100},
                {50, 1000},
                {500, 100000}
        };
    }

    @DataProvider
    private static Object[][] validNegativeData() {
        return new Object[][]{
                {-11, -1},
                {-222, -22},
                {-3333, -333}
        };
    }

    @DataProvider
    private static Object[][] validNegativeAndPositiveData() {
        return new Object[][]{
                {-100, 100},
                {-222, 222},
                {-3333, 3333}
        };
    }

    @DataProvider
    private static Object[][] forSearchFieldData() {
        return new Object[][]{
                {"Admin"},
                {"Search button clicked"},
                {"Who was first, chicken or eg?"}
        };
    }

}
