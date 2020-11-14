package dataNavigation;

import pages.AbstractPage;
import pages.FAQ_Page;
import pages.drawings.*;

public enum  DrawingsNavigation implements NavigationItem {

    HOW_PICK_WINNER("How to Pick a Winner (FREE)", HowPickWinnerPage.class),
    THIRD_PARTY_DRAW("Third-Party Draw Service", ThirdPartyDrawServicePage.class),
    STEP_BY_GUIDE("Step by Step Guide", StepByStepGuidePage.class),
    STEP_BY_VIDEO("Step by Step Video", StepByStepVideoPage.class),
    PRICE_CALCULATOR("Price Calculator", PriceCalculatorPage.class),
    PUBLIC_RECORDS("Public Records", PublicRecordsPage.class),
    TERMS_CONDTINIONS("Terms and Conditions", TermsAndConditionsPage.class),
    DRAWING_FAQ("Drawing FAQ", FAQ_Page.class);


    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    DrawingsNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget){
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
