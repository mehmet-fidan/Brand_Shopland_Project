package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;


public class WishlistPage extends ParentClass {


    By lWishlist = By.cssSelector("div i[class='yith-wcwl-icon fa fa-heart-o']");
    By lWunschlisteButton = By.xpath("//div[text()='Wunschliste']");
    By lProductsName= By.cssSelector("tbody td[class='product-name']");
    By lDeleteProductFromWishlist = By.cssSelector("tbody[class='wishlist-items-wrapper'] td[class='product-remove'] div");
    By lWishlistEmpty = By.cssSelector("td[class='wishlist-empty']");


    public void addToWishlist() {

        sleep(3000);
        List<WebElement> wishlist = driver.findElements(lWishlist);
        int randomSelection = randomNum(wishlist.size());
        System.out.println(randomSelection);
        sleep(2000);
        wishlist.get(randomSelection).click();

    }
 public void zoom () {

     JavascriptExecutor executor = (JavascriptExecutor)driver;
     executor.executeScript("document.body.style.zoom = '0.7'");
 }

 public void goToWunschListe(){
        clickTo(lWunschlisteButton);
 }

 public void productsAddedToWunschListe(){
        List<WebElement> produktsNamen = driver.findElements(lProductsName);

     for (WebElement produktsName : produktsNamen) {
         System.out.println(produktsName.getText());
     }
 }

    public void deleteProductFromWunschListe(){
        List<WebElement> produktsNamen = driver.findElements(lDeleteProductFromWishlist);
        System.out.println(produktsNamen.size());
        int sizeOfWishlist = produktsNamen.size();
        System.out.println("--------------");
        for (int i = sizeOfWishlist ; i>0 ; i--) {
            produktsNamen.get(i-1).click();
            sleep(2000);
            clickTo(lWunschlisteButton);
            produktsNamen= driver.findElements(lDeleteProductFromWishlist);
            System.out.println(produktsNamen.size());
            System.out.println("********");
        }
    }

    public void verifyAllProductsDeleted(){

        String text = driver.findElement(lWishlistEmpty).getText();
        Assert.assertEquals(text,"Keine Produkte zur Wunschliste hinzugefügt!","not same text");
    }

}
