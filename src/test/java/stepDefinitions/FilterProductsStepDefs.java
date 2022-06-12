package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.FilterPage;


public class FilterProductsStepDefs {

    FilterPage filter = new FilterPage();

    @Then("user clicks filter button")
    public void userClicksFilterButton() {
        filter.filterButton();
    }

    @Then("user enter product options")
    public void userEnterProductOptions() {
        filter.filterAll();
    }


    @And("user enter price option")
    public void userEnterPriceOption() {
        filter.priceFilter();
    }
}
