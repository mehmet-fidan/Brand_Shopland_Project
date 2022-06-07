package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.FilterPage;


public class filterDefs {

    FilterPage filter = new FilterPage();

    @Then("user clicks filter button")
    public void userClicksFilterButton() {
        filter.filterButton();
    }

    @Then("user select color options")
    public void userSelectColorOptions() {
        filter.colorFilter();
    }

  /*  @Then("user select size option")
    public void userSelectSizeOption() {
        filter.sizeColor();
    }

   */

}
