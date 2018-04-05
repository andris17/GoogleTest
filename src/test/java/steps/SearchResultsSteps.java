package steps;

import cucumber.api.java.en.When;
import pageobjects.SearchResults;

public class SearchResultsSteps {
    private SearchResults searchResults;

    public SearchResultsSteps() {
        searchResults = new SearchResults();
    }

    @When("^I switch menu to (.*)$")
    public void switchSearchMenu(String menuItem) {
        searchResults.switchMenu(menuItem);
    }
}
