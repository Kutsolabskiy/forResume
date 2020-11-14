package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Browser;
import utils.DriverProvider;

public abstract class AbstractTest {
    @BeforeTest
    public void setupDriver() {
        DriverProvider.start(Browser.CHROME);
    }

    @AfterTest(alwaysRun = true)
    public void stopDriver() {
        DriverProvider.releaseCurrentDriver();
    }
}
