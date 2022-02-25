package pageobjects;

import org.openqa.selenium.By;

import static driver.DriverMethods.*;

public class Google {

    private final By body = By.id("body");
    private final By logo = By.id("logo");
    private final By luckyButton = By.xpath("//*[@class='FPdoLc lJ9FBc']//*[@name='btnI']");
    private final By searchButton = By.name("btnK");
    private final By searchButtonTypeAhead = By.className("lsb");
    private final By searchField = By.id("lst-ib");
    private final By acceptPrivacyMsg = By.xpath("//button/div[@role='none' and text()='I agree']");

    public Google() {

    }

    public void goToGoogle() {
        navigate("http://google.com");
        clickElement(acceptPrivacyMsg);
    }

    public void goToLucky() {
        clickElement(luckyButton);
    }

    public void search(String searchParam) {
        setText(searchField, searchParam);
        clickElement(searchButtonTypeAhead);
    }

    public void searchSuggestion(String searchParam) {
        setText(searchField, searchParam);
        clickAway();
        clickElement(searchButton);
    }

    public boolean isLogoDisplayed() {
        return isDisplayed(logo);
    }

    private void clickAway() {
        clickElement(body);
    }
}
