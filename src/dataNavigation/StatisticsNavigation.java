package dataNavigation;

import pages.AbstractPage;
import pages.statistics.*;

public enum StatisticsNavigation implements NavigationItem {

    REAL_TIME("Real-Time Statistics", RealTimeStatisticsPage.class),
    GRAPH_BROWSER("Graph Browser", GraphBrowserPage.class),
    TESTING_RANDOM("Testing Random Numbers", TestingRandomNumbersPage.class),
    TOTAL_BIT("Total Bit Tally", TotalBitTallyPage.class),
    YOUR_QUOTA("Your Quota", YourQuotaPage.class);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    StatisticsNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget){
        this.description = description;
        this.redirectionTarget = redirectionTarget;
    }

    @Override
    public String getName() {
        return description;
    }

    @Override
    public Class<? extends AbstractPage<?>> getRedirectionTarget() {
        return redirectionTarget;
    }
}
