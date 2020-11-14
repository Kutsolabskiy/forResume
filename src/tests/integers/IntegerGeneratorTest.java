package tests.integers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.integers.IntegerGeneratorNumberPage;
import tests.AbstractTest;
import utils.DriverProvider;
import utils.ElementUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerGeneratorTest extends AbstractTest {


    @Test(dataProvider = "integerGenerationRequest")
    public void testIntegerGeneration(int numbersCount, int min, int max, int rowSize){
        IntegerGeneratorNumberPage integerGeneratorNumberPage = new IntegerGeneratorNumberPage()
                .get().
                        setIntegersForSimpleTest(numbersCount, min, max, rowSize);


        verifyResults(integerGeneratorNumberPage.getResults(), rowSize, min, max, numbersCount);
    }

    @Test(dataProvider = "integerGenerationRequest")
    public void VerifyAutoResetFormOnIntegersPageSimpleMode(int numbersCount, int min, int max, int rowSize){
        IntegerGeneratorNumberPage integerGeneratorNumberPage = new IntegerGeneratorNumberPage()
                .get().
                        setIntegersForResetSimpleTest(numbersCount, min, max, rowSize);

        verifyResetResult();
    }

    @Test(dataProvider = "integerGenerationRequestAmountColumns")
    public void VerifyGenerationAmountNumbersOnSimpleMode(int numbersCount, int min, int max, int rowSize){
        IntegerGeneratorNumberPage integerGeneratorNumberPage = new IntegerGeneratorNumberPage()
                .get().
                        setIntegersForSimpleTest(numbersCount, min, max, rowSize);

        verifyResultAmountNumbers(integerGeneratorNumberPage.getResults(), numbersCount);
    }

    @Test(dataProvider = "integerGenerationRequestBetweenMin_Max")
    public void VerifyGenerationBetweenMin_MaxOnSimpleMode(int numbersCount, int min, int max, int rowSize){
        IntegerGeneratorNumberPage integerGeneratorNumberPage = new IntegerGeneratorNumberPage()
                .get().
                        setIntegersForSimpleTest(numbersCount, min, max, rowSize);

        verifyResultBetweenMin_MaxNumbers(integerGeneratorNumberPage.getResults(), min, max);
    }

    @Test(dataProvider = "integerGenerationRequestAmountColumns")
    public void VerifyGenerationAmountColumnOnSimpleMode(int numbersCount, int min, int max, int rowSize){
        IntegerGeneratorNumberPage integerGeneratorNumberPage = new IntegerGeneratorNumberPage()
                .get().
                        setIntegersForSimpleTest(numbersCount, min, max, rowSize);

        verifyResultAmountColumnNumbers(integerGeneratorNumberPage.getResults(), min, max);
    }

    private void verifyResultBetweenMin_MaxNumbers(List<List<Integer>> results, int min, int max){
        List<Integer> allNumbers = results.stream().flatMap(Collection::stream).collect(Collectors.toList());
        List<Integer> outOfBoundsValues = allNumbers.stream().filter(value -> !(value >= min && value <= max)).collect(Collectors.toList());
        Assert.assertTrue(outOfBoundsValues.isEmpty());
    }

    private void verifyResultAmountColumnNumbers(List<List<Integer>> results, int numbersCount, int rowSize){
        List<Integer> rowSizes = results.stream().map(List::size).collect(Collectors.toList());
        Integer[] sizes = new Integer[(numbersCount / rowSize) + (numbersCount % rowSize == 0 ? 0 : 1)];
        Arrays.fill(sizes, rowSize);
        sizes[sizes.length - 1] = numbersCount % rowSize == 0 ? rowSize : numbersCount % rowSize;
        List<Integer> expectedRowSizes = Arrays.asList(sizes);
        Assert.assertEquals(rowSizes, expectedRowSizes);

    }

    private void verifyResetResult(){
        int numValue = ElementUtils.getIntegerValueFromCurrentElementFromHisName("num");
        int minValue = ElementUtils.getIntegerValueFromCurrentElementFromHisName("min");
        int maxValue = ElementUtils.getIntegerValueFromCurrentElementFromHisName("max");
        int colValue = ElementUtils.getIntegerValueFromCurrentElementFromHisName("col");

        Assert.assertTrue(numValue == 100 && minValue == 1 && maxValue == 100 && colValue == 5);
    }

    private void verifyResultAmountNumbers(List<List<Integer>> results, int numbersCount){
        List<Integer> allNumbers = results.stream().flatMap(Collection::stream).collect(Collectors.toList());
        Assert.assertTrue(allNumbers.size() == numbersCount);
    }

    private void verifyResults(List<List<Integer>> results, int rowSize, int min, int max, int numbersCount) {
        List<Integer> rowSizes = results.stream().map(List::size).collect(Collectors.toList());
        Integer[] sizes = new Integer[(numbersCount / rowSize) + (numbersCount % rowSize == 0 ? 0 : 1)];
        Arrays.fill(sizes, rowSize);
        sizes[sizes.length - 1] = numbersCount % rowSize == 0 ? rowSize : numbersCount % rowSize;
        List<Integer> expectedRowSizes = Arrays.asList(sizes);
        Assert.assertEquals(rowSizes, expectedRowSizes, "Incorrect row size in results: " + results);
        List<Integer> inlineResults = results.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        List<Integer> outOfBoundsValues = inlineResults.stream()
                .filter(value -> !(value <= max && value >= min))
                .collect(Collectors.toList());
        Assert.assertTrue(
                outOfBoundsValues.isEmpty(),
                String.format("Values out of bounds found: %s in results: %s", outOfBoundsValues, results));
        Assert.assertEquals(inlineResults.size(), numbersCount, "Incorrect results count");
    }

    @DataProvider
    private static Object[][] integerGenerationRequest() {
        return new Object[][] {
                {30, 1, 10, 3},
                {15, -10, -1, 1},
                {100, -10, 10, 15},
                {10, -10, 10, 30},

        };
    }

    @DataProvider
    private static Object[][] integerGenerationRequestAmountNumbers() {
        return new Object[][] {
                {138, 1, 100, 5},
                {116, 1, 100, 5},
                {56, 1, 100, 5},
                {1000, 1, 100, 5},
        };
    }

    @DataProvider
    private static Object[][] integerGenerationRequestBetweenMin_Max() {
        return new Object[][] {
                {100, 10, 99, 5},
                {100, -10, 0, 5},
                {100, -10, 10, 5},
                {100, -100, 100, 5},
        };
    }

    @DataProvider
    private static Object[][] integerGenerationRequestAmountColumns() {
        return new Object[][] {
                {100, 1, 100, 10},
                {100, 1, 100, 5},
                {100, 1, 100, 24},
                {100, 1, 100, 50},
        };
    }



}
