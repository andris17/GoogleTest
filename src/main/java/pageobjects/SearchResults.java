package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

import static driver.DriverMethods.clickElement;

public class SearchResults {
    private final By searchMenu = By.id("hdtb-msb-vis");
    private final By searchTools = By.id("hdtbMenus");

    public void switchMenu(String menuItem) {
        clickElement(new ByChained(searchMenu, By.xpath("./div/a[text()='" + menuItem + "']")));
    }
}
