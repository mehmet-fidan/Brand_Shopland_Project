package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.FilterPage;


public class filterDefs {

    FilterPage filter = new FilterPage();

    @Then("user clicks filter button")
    public void userClicksFilterButton() {
        filter.filterButton();
    }

    @Then("user enter product options")
    public void userEnterProductOptions() {
        filter.filterAll();
    }


}
