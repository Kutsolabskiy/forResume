package dataNavigation;

import pages.AbstractPage;
import pages.games.*;
import tests.AbstractTest;

public enum  GamesNavigation implements NavigationItem {

    LOTTERY("Lottery Quick Pick", LotteryQuickPickGamePage.class),
    KENO("Keno Quick Pick", KenoQuickPickGamePage.class),
    COIN("Coin Flipper", CoinFlipperGamePage.class),
    DICE("Dice Roller", DiceRollerGamePage.class),
    CARD_SHUFFLER("Playing Card Shuffler", PlayingCardShufflerGamePage.class),
    BIRDIE("Birdie Fund Generator", BirdieFundRandomizerGamePage.class);


    private final String description;  //description - описание

    private final Class<? extends AbstractPage<?>> redirectionTarget;  //redirectionTarget - цель перенаправления

    GamesNavigation(String desc, Class<? extends AbstractPage<?>> redirectionTarget) {
        this.description = desc;
        this.redirectionTarget = redirectionTarget;
    }

    @Override
    public String getName(){
        return this.description;
    }


    @Override
    public Class<? extends AbstractPage<?>> getRedirectionTarget() {
        return redirectionTarget;
    }
}
