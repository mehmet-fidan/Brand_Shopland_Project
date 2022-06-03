package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;

public class AllProducts extends ParentClass {

    By lAlleProdukte = By.xpath("(//span[text()='Alle Produkte'])[1]");
    By lListOfProducts = By.cssSelector("ul[class='products columns-3'] li");
  //  By lAllPicture = By.cssSelector("li div[class='astra-shop-thumbnail-wrap'] a>img");
    By lALLButton= By.cssSelector("a[data-type='all']");


    By lImages = By.cssSelector("li div[class='astra-shop-thumbnail-wrap'] img");



    public void alleProdukte(){
        clickTo(lAlleProdukte);
        clickTo(lALLButton);
    }

    public void resimFiyatkontrol() {
        List<WebElement> pictures = driver.findElements(lListOfProducts);
      //  List<WebElement> images = driver.findElements(lImages);
        Actions builder = new Actions(driver);

        for (WebElement picture : pictures) {
            Action action = builder.moveToElement(picture).pause(10).build();
           // Action action = builder.moveToElement(picture).click().build();
            action.perform();
            System.out.println(picture.getText());
            if (picture.getAttribute("img")==null)
                System.out.println("no picture");
        }

    }
}
