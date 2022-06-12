package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllProducts;

public class AllProductsStepDefs {

    AllProducts allProducts = new AllProducts();



    @When("user clicks to alle produkte")
    public void userClicksToAlleProdukte() {
        allProducts.alleProdukte();
    }

    @Then("user checks pictures and prices")
    public void userChecksPicturesAndPrices() {
        allProducts.resimFiyatkontrol();
    }

    @Then("user clicks left kategorie")
    public void userClicksLeftKategorie() {
        allProducts.dropDown();
    }

    @Then("user clicks rightside order option")
    public void userClicksRightsideOrderOption() {
        allProducts.orderBy();
    }

    @And("user close the driver")
    public void userCloseTheDriver() {
        allProducts.quitDriver();
    }
}
