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

    @Then("user checks second page pictures")
    public void userChecksSecondPagePictures() {
        allProducts.nextPage2();
    }

    @And("user checks third page pictures")
    public void userChecksThirdPagePictures() {
        allProducts.nextPage3();

    }

}
