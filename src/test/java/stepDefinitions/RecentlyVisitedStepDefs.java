package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RecentlyVisitedProductsPage;

public class RecentlyVisitedStepDefs {

RecentlyVisitedProductsPage recent = new RecentlyVisitedProductsPage();

    @When("user clicks a product")
    public void userClicksAProduct() {
        recent.selectProductRandomly();

    }

    @And("user sees at left-side products he-she clicked")
    public void userSeesAtLeftSideProductsHeSheClicked() {

        recent.varifyTheRecentProductList();
    }
}
