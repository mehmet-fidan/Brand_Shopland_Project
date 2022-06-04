package stepDefinitions;

import io.cucumber.java.en.When;
import pages.DropDown;

public class dropKategorieDefs {

    DropDown dropDown = new DropDown();

    @When("user clicks left kategorie")
    public void userClicksLeftKategorie() {
        dropDown.dropDown();
    }
}
