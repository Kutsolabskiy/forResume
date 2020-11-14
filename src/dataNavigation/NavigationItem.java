package dataNavigation;

import pages.AbstractPage;

public interface NavigationItem {

    String getName();

    Class<? extends AbstractPage<?>> getRedirectionTarget();
}

