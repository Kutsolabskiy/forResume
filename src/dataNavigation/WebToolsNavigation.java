package dataNavigation;

import pages.AbstractPage;
import pages.webTools.*;

public enum  WebToolsNavigation implements NavigationItem {

    WIDGETS_YOU_PAGE("Widgets for Your Pages", WebWidgetsPage.class),
    API("API for Automated Clients", APIPage.class),
    OLD_API("Old API for Automated Clients", Old_API_Page.class),
    OLD_GUIDELINES("Old Guidelines for Automated Clients", OldGuidelinesPage.class),
    BANNED_HOSTS("Banned Hosts", BannedHostsPage.class);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    WebToolsNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget){
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
