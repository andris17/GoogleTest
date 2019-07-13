package pageobjects;

import org.openqa.selenium.By;

import static driver.DriverMethods.*;

public class Google {

    private final By body = By.id("body");
    private final By logo = By.id("logo");
    private final By luckyButton = By.name("btnI");
    private final By searchButton = By.name("btnK");
    private final By searchField = By.name("q");

    public Google() {

    }

    public void goToGoogle() {
        navigate("http://google.com");
    }

    public void goToLucky() {
        clickElement(luckyButton);
    }

    public void search(String searchParam) {
        clearAndSetText(searchField, searchParam);
        clickElement(searchButton);
    }

    public boolean isLogoDisplayed() {
        return isDisplayed(logo);
    }

    private void clickAway() {
        clickElement(body);
    }
}
