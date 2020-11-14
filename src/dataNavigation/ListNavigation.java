package dataNavigation;

import pages.AbstractPage;
import pages.lists_more.*;

public enum  ListNavigation implements NavigationItem {

    LIST_RANDOM("List Randomizer", ListRandomizerPage.class),
    STRINGS("Strings", StringsPage.class),
    PASSWORDS("Passwords", PasswordsGeneratorPage.class),
    CLOCK_TIME("Clock Times", ClockTimeGeneratorPage.class),
    CALENDAR("Calendar Dates", CalendarDataGeneratorPage.class),
    GEOGRAPHIC_COORDINATE("Geographic Coordinates", GeographicCoordinatesPage.class),
    BITMAP("Bitmaps",BitmapGeneratorPage.class),
    COLOR("Hex Color Codes",ColorGeneratorPage.class),
    PRE_GENERETED_FILE("Pregenerated Files", PreGeneratedFilePage.class),
    JAZZ("Jazz Scales", JazzGeneratorPage.class),
    AUDIO_NOISE("Pure White Audio Noise", AudioNoiseGeneratorPage.class),
    SAMUEL_BECKETT("Samuel Beckett", SamuelBeckettInfoPage.class);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    ListNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget){
        this.description = description;
        this.redirectionTarget = redirectionTarget;
    }

    @Override
    public String getName() {
        return this.description;
    }

    @Override
    public Class<? extends AbstractPage<?>> getRedirectionTarget() {
        return this.redirectionTarget;
    }
}
