package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.HomePagePictures;

public class HomePageStepDefs {

    HomePagePictures homePage = new HomePagePictures();

    @Given("user is at homepage")
    public void userIsAtHomepage() {
        homePage.goHomePage();
    }

}
