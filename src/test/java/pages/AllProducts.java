package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.ParentClass;

import java.util.List;

public class AllProducts extends ParentClass {

    By lAlleProdukte = By.xpath("(//span[text()='Alle Produkte'])[1]");
    By lListOfProducts = By.cssSelector("ul[class='products columns-3'] li");
  //  By lAllPicture = By.cssSelector("li div[class='astra-shop-thumbnail-wrap'] a>img");

    By pageNumber2 = By.xpath("//li//a[text()='2']");
    By pageNumber3 = By.xpath("//li//a[text()='3']");



    public void alleProdukte(){
        clickTo(lAlleProdukte);
    }

    public void resimFiyatkontrol() {
        List<WebElement> pictures = driver.findElements(lListOfProducts);
        Actions builder = new Actions(driver);

        for (WebElement picture : pictures) {
            Action action = builder.moveToElement(picture).pause(10).build();
           // Action action = builder.moveToElement(picture).click().build();
            action.perform();
        }

    }

    public void nextPage2 (){

        clickTo(pageNumber2);
    }

    public void nextPage3 (){

        clickTo(pageNumber3);
    }
}
