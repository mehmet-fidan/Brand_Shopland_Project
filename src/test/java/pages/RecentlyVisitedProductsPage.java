package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;

public class RecentlyVisitedProductsPage extends ParentClass {

    public RecentlyVisitedProductsPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "li a h2")
    private List<WebElement>  eProductsList;

    @FindBy(xpath = "//h2[text()='neulich angesehen…']")
    private WebElement eRecentlyCategorie;

    public void selectProductRandomly(){

        String textOfRandomProduct= eProductsList.get(randomNum(eProductsList.size())).getText();
        eProductsList.get(randomNum(eProductsList.size())).click();
        System.out.println(textOfRandomProduct);
    }

    public void varifyTheRecentProductList(){

        String textOFCategorie = "neulich angesehen…";
        Assert.assertEquals(eRecentlyCategorie.getText(),textOFCategorie,"the message is not same");
    }

}
