package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchFieldPage;

public class SearchFieldStepDefs {

    SearchFieldPage searchField = new SearchFieldPage();

    @When("user enters a text to the search field of header menu")
    public void userEntersATextToTheSearchFieldOfHeaderMenu() {
        searchField.menuBarSearchField();
    }

    @Then("user verify the search result")
    public void userVerifyTheSearchResult() {
        searchField.verifyMenuBarSearchText();
    }

    @Then("user enters a text to the search field of buttom leftside")
    public void userEntersATextToTheSearchFieldOfButtomLeftside() {
        searchField.leftSideSearchField();
    }
}
