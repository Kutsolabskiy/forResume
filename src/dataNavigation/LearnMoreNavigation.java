package dataNavigation;

import pages.AbstractPage;
import pages.FAQ_Page;
import pages.learnMore.*;

public enum LearnMoreNavigation implements NavigationItem {

    ABOUT_CONTACT("About & Contact", About_ContactPage.class),
    TERMS_AND_CONDITIONS_LEARN("Terms and Conditions", TermsAndConditionsPageLearnMore.class),
    FAQ_LEARN_MORE("FAQ", FAQ_Page.class),
    INTRODUCTION("Introduction to Randomness", IntroductionToRandomnessPage.class),
    HISTORY("History of RANDOM.ORG", HistoryPage.class),
    ACKNOWLEDGEMENTS("Acknowledgements", AcknowledgementsPage.class),
    MEDIA_SCIENTIFIC("Media and Scientific Citations", MediaAndScientificPage.class),
    NEWSLETTER("Newsletter", NewsletterPage.class),
    QUOTATION("Quotations about Randomness", QuotationsPage.class),
    WHATS_NEW("What\'s New!", WhatsNewPage.class);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;


    LearnMoreNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget){
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
