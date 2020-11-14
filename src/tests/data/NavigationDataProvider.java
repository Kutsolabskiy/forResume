package tests.data;

import dataNavigation.*;
import org.testng.annotations.DataProvider;
import pages.AbstractPage;
import pages.FAQ_Page;
import pages.drawings.TermsAndConditionsPage;
import pages.games.*;
import pages.drawings.*;
import pages.homePages.*;
import pages.integers.*;
import pages.learnMore.*;
import pages.lists_more.*;
import pages.statistics.*;
import pages.testimonials.*;
import pages.webTools.*;

import java.util.HashMap;
import java.util.Map;

public class NavigationDataProvider {

    @DataProvider
    public static Object[][] gamesNavigation() {
        return new Object[][]{
                {GamesNavigation.LOTTERY},
                {GamesNavigation.KENO},
                {GamesNavigation.COIN},
                {GamesNavigation.DICE},
                {GamesNavigation.CARD_SHUFFLER},
                {GamesNavigation.BIRDIE}
        };
    }

    @DataProvider
    public static Object[][] numbersNavigation() {
        return new Object[][]{
                {NumbersNavigation.INTEGERS},
                {NumbersNavigation.SEQUENCES},
                {NumbersNavigation.INTEGER_SETS},
                {NumbersNavigation.GAUSSIAN_NUMBERS},
                {NumbersNavigation.DECIMAL_FRACTIONS},
                {NumbersNavigation.RAW_BYTES}
        };
    }

    @DataProvider
    public static Object[][] listsNavigation() {
        return new Object[][]{
                {ListNavigation.LIST_RANDOM},
                {ListNavigation.STRINGS},
                {ListNavigation.PASSWORDS},
                {ListNavigation.CLOCK_TIME},
                {ListNavigation.CALENDAR},
                {ListNavigation.GEOGRAPHIC_COORDINATE},
                {ListNavigation.BITMAP},
                {ListNavigation.COLOR},
                {ListNavigation.PRE_GENERETED_FILE},
                {ListNavigation.JAZZ},
                {ListNavigation.AUDIO_NOISE},
                {ListNavigation.SAMUEL_BECKETT}
        };
    }

    @DataProvider
    public static Object[][] drawingsNavigation() {
        return new Object[][]{
                {DrawingsNavigation.HOW_PICK_WINNER},
                {DrawingsNavigation.THIRD_PARTY_DRAW},
                {DrawingsNavigation.STEP_BY_GUIDE},
                {DrawingsNavigation.STEP_BY_VIDEO},
                {DrawingsNavigation.PRICE_CALCULATOR},
                {DrawingsNavigation.PUBLIC_RECORDS},
                {DrawingsNavigation.TERMS_CONDTINIONS},
                {DrawingsNavigation.DRAWING_FAQ},


        };
    }

    @DataProvider
    public static Object[][] webToolsNavigation() {
        return new Object[][]{
                {WebToolsNavigation.WIDGETS_YOU_PAGE},
                {WebToolsNavigation.API},
                {WebToolsNavigation.OLD_API},
                {WebToolsNavigation.OLD_GUIDELINES},
                {WebToolsNavigation.BANNED_HOSTS}
        };
    }

    @DataProvider
    public static Object[][] statisticsNavigation() {
        return new Object[][]{
                {StatisticsNavigation.REAL_TIME},
                {StatisticsNavigation.GRAPH_BROWSER},
                {StatisticsNavigation.TESTING_RANDOM},
                {StatisticsNavigation.TOTAL_BIT},
                {StatisticsNavigation.YOUR_QUOTA},
        };
    }

    @DataProvider
    public static Object[][] testimonialsNavigation() {
        return new Object[][]{
                {TestimonialsNavigation.LOTTERIES_DRAWINGS},
                {TestimonialsNavigation.GAMES_GAMBLING},
                {TestimonialsNavigation.RANDOM_SAMPLING},
                {TestimonialsNavigation.SIMULATIONS_MODELING},
                {TestimonialsNavigation.SECURITY},
                {TestimonialsNavigation.ARTS},
                {TestimonialsNavigation.MISCELLANEOUS}
        };
    }

    @DataProvider
    public static Object[][] learnMoreNavigation() {
        return new Object[][]{
                {LearnMoreNavigation.ABOUT_CONTACT},
                {LearnMoreNavigation.TERMS_AND_CONDITIONS_LEARN},
                {LearnMoreNavigation.FAQ_LEARN_MORE},
                {LearnMoreNavigation.INTRODUCTION},
                {LearnMoreNavigation.HISTORY},
                {LearnMoreNavigation.ACKNOWLEDGEMENTS},
                {LearnMoreNavigation.MEDIA_SCIENTIFIC},
                {LearnMoreNavigation.NEWSLETTER},
                {LearnMoreNavigation.QUOTATION},
                {LearnMoreNavigation.WHATS_NEW}
        };
    }

    public static String getExpectedTitle(Class<? extends AbstractPage<?>> redirectionTarget){
        Map<Class, String> mapTitles = new HashMap<>();

            /* GAMES */
        mapTitles.put(LotteryQuickPickGamePage.class, "RANDOM.ORG - Lottery Quick Pick");
        mapTitles.put(KenoQuickPickGamePage.class, "RANDOM.ORG - Keno Quick Pick");
        mapTitles.put(CoinFlipperGamePage.class, "RANDOM.ORG - Coin Flipper");
        mapTitles.put(DiceRollerGamePage.class, "RANDOM.ORG - Dice Roller");
        mapTitles.put(PlayingCardShufflerGamePage.class, "RANDOM.ORG - Playing Card Shuffler");
        mapTitles.put(BirdieFundRandomizerGamePage.class, "RANDOM.ORG - Birdie Fund Randomizer");

                /* INTEGERS */
        mapTitles.put(IntegerGeneratorNumberPage.class, "RANDOM.ORG - Integer Generator");
        mapTitles.put(SequencesNumbersPage.class, "RANDOM.ORG - Sequence Generator");
        mapTitles.put(IntegerSetsNumberPage.class, "RANDOM.ORG - Integer Set Generator");
        mapTitles.put(GaussianNumberPage.class, "RANDOM.ORG - Gaussian Random Number Generator");
        mapTitles.put(DecimalFractionNumberPage.class, "RANDOM.ORG - Decimal Fraction Generator");
        mapTitles.put(RawBytesNumbersPage.class, "RANDOM.ORG - Byte Generator");

                /* LIST&MORE */
        mapTitles.put(ListRandomizerPage.class, "RANDOM.ORG - List Randomizer");
        mapTitles.put(StringsPage.class, "RANDOM.ORG - String Generator");
        mapTitles.put(PasswordsGeneratorPage.class, "RANDOM.ORG - Password Generator");
        mapTitles.put(ClockTimeGeneratorPage.class, "RANDOM.ORG - Clock Time Generator");
        mapTitles.put(CalendarDataGeneratorPage.class, "RANDOM.ORG - Calendar Date Generator");
        mapTitles.put(GeographicCoordinatesPage.class, "RANDOM.ORG - Geographic Coordinates");
        mapTitles.put(BitmapGeneratorPage.class, "RANDOM.ORG - Bitmap Generator");
        mapTitles.put(ColorGeneratorPage.class, "Random Hex Color Code Generator - RANDOM.ORG");
        mapTitles.put(PreGeneratedFilePage.class, "Pregenerated File Archive - RANDOM.ORG");
        mapTitles.put(JazzGeneratorPage.class, "RANDOM.ORG - Jazz Scale Generator");
        mapTitles.put(AudioNoiseGeneratorPage.class, "RANDOM.ORG - Audio Noise Generator");
        mapTitles.put(SamuelBeckettInfoPage.class, "Possible Lessnesses");

                /* DRAWINGS */
        mapTitles.put(HowPickWinnerPage.class, "RANDOM.ORG - Frequently Asked Questions (FAQ)");
        mapTitles.put(ThirdPartyDrawServicePage.class, "RANDOM.ORG - Third-Party Draw Service - Step ");
        mapTitles.put(StepByStepGuidePage.class, "RANDOM.ORG - Guide to Random Drawings");
        mapTitles.put(StepByStepVideoPage.class, "RANDOM.ORG - Video Tutorial #1 - Blog and Business Giveaways");
        mapTitles.put(PriceCalculatorPage.class, "RANDOM.ORG - Third-Party Draw Service - Price Calculator");
        mapTitles.put(PublicRecordsPage.class, "RANDOM.ORG - Third-Party Draw Service - Public Records");
        mapTitles.put(TermsAndConditionsPage.class, "RANDOM.ORG - Third-Party Draw Service - Description");
        mapTitles.put(FAQ_Page.class, "RANDOM.ORG - Frequently Asked Questions (FAQ)");

                /* WEB TOOLS */
        mapTitles.put(WebWidgetsPage.class, "RANDOM.ORG - Web Widgets");
        mapTitles.put(APIPage.class, "API Dashboard - RANDOM.ORG");
        mapTitles.put(Old_API_Page.class, "RANDOM.ORG - HTTP Interface Description");
        mapTitles.put(OldGuidelinesPage.class, "RANDOM.ORG - Automated Clients");
        mapTitles.put(BannedHostsPage.class, "RANDOM.ORG - List of Banned Hosts");

                /* STATISTICS */
        mapTitles.put(RealTimeStatisticsPage.class, "RANDOM.ORG - Real-Time Statistics");
        mapTitles.put(GraphBrowserPage.class, "RANDOM.ORG - Statistics Browser");
        mapTitles.put(TestingRandomNumbersPage.class, "RANDOM.ORG - Statistical Analysis");
        mapTitles.put(TotalBitTallyPage.class, "RANDOM.ORG - Bit Tally");
        mapTitles.put(YourQuotaPage.class, "Quota Top-Up");

                /* TESTIMONIALS */
        mapTitles.put(LotteriesAndDrawingsPage.class, "RANDOM.ORG - Testimonials - Lotteries and Draws");
        mapTitles.put(GamesAndGamblingPage.class, "RANDOM.ORG - Testimonials - Games and Gambling");
        mapTitles.put(RandomSamplingPage.class, "RANDOM.ORG - Testimonials - Random Sampling");
        mapTitles.put(SimulationAndModellingPage.class, "RANDOM.ORG - Testimonials - Simulation and Modelling");
        mapTitles.put(SecurityPage.class, "RANDOM.ORG - Testimonials - Security");
        mapTitles.put(TheArtsPage.class, "RANDOM.ORG - Testimonials - The Arts");
        mapTitles.put(MiscellaneousPage.class, "RANDOM.ORG - Testimonials - Miscellaneous");

                /* LEARN MORE */
        mapTitles.put(About_ContactPage.class, "RANDOM.ORG - Company Information");
        mapTitles.put(TermsAndConditionsPageLearnMore.class, "RANDOM.ORG - Terms and Conditions - Privacy Policy");
        mapTitles.put(FAQ_Page_LearnMore.class, "RANDOM.ORG - Frequently Asked Questions (FAQ)");
        mapTitles.put(IntroductionToRandomnessPage.class, "RANDOM.ORG - Introduction to Randomness and Random Numbers");
        mapTitles.put(HistoryPage.class, "RANDOM.ORG - The History of RANDOM.ORG");
        mapTitles.put(AcknowledgementsPage.class, "RANDOM.ORG - List of Helpful Individuals");
        mapTitles.put(MediaAndScientificPage.class, "RANDOM.ORG - Media Coverage and Citations");
        mapTitles.put(NewsletterPage.class, "RANDOM.ORG - Newsletter");
        mapTitles.put(QuotationsPage.class, "RANDOM.ORG - Quotations about Randomness");
        mapTitles.put(WhatsNewPage.class, "RANDOM.ORG - News");

        return mapTitles.get(redirectionTarget);
    }

}

