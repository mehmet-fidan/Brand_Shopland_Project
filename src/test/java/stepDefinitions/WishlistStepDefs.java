package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.WishlistPage;



public class WishlistStepDefs {

    WishlistPage wishlist = new WishlistPage();


    @Then("user adds products to wish list")
    public void userAddsProductsToWishList() {
        wishlist.addToWishlist();
    }

    @Then("user checks products name")
    public void userChecksProductsName() {
        wishlist.productsAddedToWunschListe();
    }

    @Then("user clicks to wunschlist button")
    public void userClicksToWunschlistButton() {
        wishlist.goToWunschListe();
    }


    @Then("user deletes added products from wishlist and verify it")
    public void userDeletesAddedProductsFromWishlistAndVerifyIt() {
        wishlist.deleteProductFromWunschListe();
        wishlist.verifyAllProductsDeleted();
    }
}
