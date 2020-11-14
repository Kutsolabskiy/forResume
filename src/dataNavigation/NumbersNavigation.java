package dataNavigation;

import pages.AbstractPage;
import pages.integers.*;

public enum NumbersNavigation implements NavigationItem {

    INTEGERS("Integers", IntegerGeneratorNumberPage.class),
    SEQUENCES("Sequences", SequencesNumbersPage.class),
    INTEGER_SETS("Integer Sets", IntegerSetsNumberPage.class),
    GAUSSIAN_NUMBERS("Gaussian Numbers", GaussianNumberPage.class),
    DECIMAL_FRACTIONS("Decimal Fractions", DecimalFractionNumberPage.class),
    RAW_BYTES("Raw Bytes", RawBytesNumbersPage.class);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    NumbersNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget){
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
