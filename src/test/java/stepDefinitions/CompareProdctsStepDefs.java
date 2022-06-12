package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CompareProductPage;

public class CompareProdctsStepDefs {

    CompareProductPage compareProduct = new CompareProductPage();

    @When("user selects first product")
    public void userSelectsFirstProduct() {
        compareProduct.FirstProdAdditionToCompList();
    }

    @Then("user selects second product")
    public void userSelectsSecondProduct() {
        compareProduct.SecondProdAdditionToCompList();
    }

    @And("user checks the products from comparisonlist")
    public void userChecksTheProductsFromComparisonlist() {
        compareProduct.verifyProductAddition();
    }
}
