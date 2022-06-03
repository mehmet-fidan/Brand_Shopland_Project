package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllProducts;

public class PicturesDefs {

    AllProducts allProducts = new AllProducts();


    @And("user clicks to alle produkte")
    public void userClicksToAlleProdukte() {
        allProducts.alleProdukte();
    }

    @When("user checks pictures")
    public void userChecksPictures() {
        allProducts.resimFiyatkontrol();
    }


}
