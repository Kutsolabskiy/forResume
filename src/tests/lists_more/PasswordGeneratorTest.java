package tests.lists_more;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.lists_more.PasswordsGeneratorPage;
import tests.AbstractTest;

import java.util.List;
import java.util.stream.Stream;

public class PasswordGeneratorTest extends AbstractTest {

    @Test(dataProvider = "passwordGeneratorRequest")
    public void testPasswordGenerator(int num, int len){
        PasswordsGeneratorPage passwordGeneratorPage = new PasswordsGeneratorPage().get().getInteger(num, len);

        verifyResult(passwordGeneratorPage.getResult(), num, len);
    }

    @DataProvider()
    private static Object[][] passwordGeneratorRequest(){
        return new Object[][]{
                {4, 10},
                {6, 8},
                {2, 9},
                {3, 6},
                {1, 7},
        };
    }

    public void verifyResult(List<String> resultList, int num, int len){
        for (String res : resultList){
            Assert.assertEquals(len, res.length());
        }
        Assert.assertEquals(num, resultList.size());

    }

}
