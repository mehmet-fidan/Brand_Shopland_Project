package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllProducts;

public class AllProductsDefs {

    AllProducts allProducts = new AllProducts();


    @And("user clicks to alle produkte")
    public void userClicksToAlleProdukte() {
        allProducts.alleProdukte();
    }

    @When("user checks pictures and prices")
    public void userChecksPicturesAndPrices() {
        allProducts.resimFiyatkontrol();
    }
}
