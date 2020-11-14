package dataNavigation;

import pages.AbstractPage;
import pages.testimonials.*;

public enum TestimonialsNavigation implements NavigationItem {

    LOTTERIES_DRAWINGS("Lotteries and Drawings", LotteriesAndDrawingsPage.class),
    GAMES_GAMBLING("Games and Gambling", GamesAndGamblingPage.class),
    RANDOM_SAMPLING("Random Sampling", RandomSamplingPage.class),
    SIMULATIONS_MODELING("Simulation and Modelling", SimulationAndModellingPage.class),
    SECURITY("Security", SecurityPage.class),
    ARTS("The Arts", TheArtsPage.class),
    MISCELLANEOUS("Miscellaneous", MiscellaneousPage.class);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    TestimonialsNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget){
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
