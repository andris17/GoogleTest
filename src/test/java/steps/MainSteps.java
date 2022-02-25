package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.Google;

public class MainSteps {

    private final Google google;

    public MainSteps() {
        google = new Google();
    }

    @Given("^I open Google$")
    public void goToGoogle() {
        google.goToGoogle();
    }

    @When("^I go to the lucky page$")
    public void goToLuckyPage() {
        google.goToLucky();
    }

    @When("^I search for (.*)$")
    public void search(String searchParam) {
        google.search(searchParam);
    }

    @When("^I select the first suggestion when searching for (.*)$")
    public void searchSuggestion(String searchParam) {
        google.searchSuggestion(searchParam);
    }

    @Then("^I see the Google logo$")
    public void logoIsDisplayed() {
        Assert.assertTrue(google.isLogoDisplayed());
    }
}
