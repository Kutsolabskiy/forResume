package pages.components;

import com.google.common.collect.ImmutableMap;
import dataNavigation.*;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import pages.AbstractPage;
import pages.integers.IntegerGeneratorNumberPage;
import utils.ElementUtils;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class NavigationPage <T extends NavigationPage<T>> extends AbstractPage<T> {

    private static  final Map<Class<? extends NavigationItem>, NavigationSection> CLASS_NAVIGATION_SECTION_MAP =
            ImmutableMap.<Class<? extends NavigationItem>, NavigationSection>builder()
                    .put(GamesNavigation.class, NavigationSection.GAMES)
                    .put(NumbersNavigation.class, NavigationSection.NUMBERS)
                    .put(ListNavigation.class, NavigationSection.LIST_MORE)
                    .put(DrawingsNavigation.class, NavigationSection.DRAWINGS)
                    .put(WebToolsNavigation.class, NavigationSection.WEB_TOOLS)
                    .put(StatisticsNavigation.class, NavigationSection.STATISTICS)
                    .put(TestimonialsNavigation.class, NavigationSection.TESTIMONIALS)
                    .put(LearnMoreNavigation.class, NavigationSection.LEARN_MORE)
            .build();

    private enum NavigationSection{
        GAMES("Games"),
        NUMBERS("Numbers"),
        LIST_MORE("Lists & More"),
        DRAWINGS("Drawings"),
        WEB_TOOLS("Web Tools"),
        STATISTICS("Statistics"),
        TESTIMONIALS("Testimonials"),
        LEARN_MORE("Learn More");

        private final String desc;

        NavigationSection(String description){
            this.desc = description;
        }
    }

    public void navigateTo(NavigationItem item){
        Objects.requireNonNull(item);
        NavigationSection section = CLASS_NAVIGATION_SECTION_MAP.get(item.getClass());
        NavigateComponent component = getNavigateComponent(section);
        component.navigate(item);
    }
    
    private NavigateComponent getNavigateComponent(NavigationSection section){
        By sectionlocator = By.xpath(String.format("//li[child::a[text() = '%s']]", section.desc));

        return new NavigateComponent(getDriver().findElement(sectionlocator));
    }

}
