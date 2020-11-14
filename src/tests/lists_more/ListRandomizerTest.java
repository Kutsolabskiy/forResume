package tests.lists_more;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.lists_more.ListRandomizerPage;
import tests.AbstractTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListRandomizerTest extends AbstractTest {

    @Test(dataProvider = "listGenerationRequest")
    public void testListGeneration(String row){
        ListRandomizerPage listRandomizer = new ListRandomizerPage().get()
                .getRow(row);

        verifyResults(listRandomizer.getResults(), row);
    }

    @DataProvider
    private static Object[][] listGenerationRequest(){
        return new Object[][] {
                {"fgadsuijhg\nliytjtjuig\naeuydfdflgn\nnmbvbnogisaoI\nHUOWEBGAIDF"},
                {"dfassduijhg\nlirgilj;IOJuig\naefewioJdflgn\nuivxxxaoI\nEDAIDF"},
                {"dasdcijhg\nlirasdfsfadfsdauig\ndflgn\nuiasaoI\nEDNWsdfsEFABGAIDF"},
                {"fgadvsdg\nlsdvzauig\nbhfrhiadflgn\nuigisaoI\nEDNWEFABGAIDF"},
                {"fgsdhg\nlirgfjuyDdauig\naeogfdereuiadflgn\nuiaerbgdgsfgsaoI\nEDNWEFABGAIDF"},
                {"fgafjhg\nlirgfjundauig\naeoguiadflgn\nuiaerbogisaoI\nEDNWEFABGAIDF"},
        };
    }

    private List<String> stringPackToList(String row){
        return Stream.of(row.split("\n")).collect(Collectors.toList());
    }

    private void verifyResults(String result, String originalRow){
        List<String> resultList = stringPackToList(result);
        List<String> originalList = stringPackToList(result);

        Assert.assertEquals(resultList.size(), originalList.size());
        Assert.assertTrue(resultList.containsAll(originalList));

    }
}

