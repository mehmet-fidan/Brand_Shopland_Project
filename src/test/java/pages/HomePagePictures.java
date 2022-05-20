package pages;

import org.openqa.selenium.By;
import utils.ParentClass;

public class HomePagePictures extends ParentClass {


    String url = "https://brandstore.e-shopland.ch/";


    By lAusblenden = By.xpath("//a[text()='Ausblenden']");

    public void goHomePage() {
        openWebSite(url);
        clickTo(lAusblenden);
    }

    public void productPictureControl() {

    }
}
