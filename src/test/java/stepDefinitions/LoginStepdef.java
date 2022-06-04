package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ParentClass;

public class LoginStepdef {

    LoginPage logPage = new LoginPage();


    @When("does all products have picture")
    public void doesAllProductsHavePicture() {
    }

    @When("user clicks login section")
    public void userClicksLoginSection() {
        logPage.loginButton();
    }

    @Then("user enters username and password")
    public void userEntersUsernameAndPassword() {
        logPage.toLogin();
    }

    @And("user confirms entering account")
    public void userConfirmsEnteringAccount() {
        logPage.loginConfirm();
    }

    @And("user goes back homepage")
    public void userGoesBackHomepage() {
        logPage.homePage();
    }
}
