package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.ParentClass;

import java.util.List;

public class AllProducts extends ParentClass {

    By lAlleProdukte = By.xpath("(//span//span[text()='Alle Produkte'])[1]");
    By lListOfProducts = By.cssSelector("li div a h2");
    By lALLButton = By.cssSelector("a[data-type='all']");
    By lPrices = By.cssSelector("li div[class='astra-shop-summary-wrap'] span[class='price']");
    By lPictures = By.cssSelector("div[class='astra-shop-thumbnail-wrap'] a img");

    By lDropDownKategorie = By.cssSelector("select[id='product_cat']");
    By lOrderOptions = By.cssSelector("select[class='orderby']");


    public void alleProdukte() {
        clickTo(lAlleProdukte);
        clickTo(lALLButton);
    }


    public void resimFiyatkontrol() {
        List<WebElement> productsTitle = driver.findElements(lListOfProducts);
        List<WebElement> prices = driver.findElements(lPrices);
        List<WebElement> productsPicture = driver.findElements(lPictures);

        System.out.println(productsTitle.size());
        System.out.println(prices.size());

        for (int i = 0; i < productsTitle.size(); i++) {

            for (int j = 0; j < prices.size(); j++) {
                if (i == j) {
                    System.out.println(productsTitle.get(i).getText() + ": " + prices.get(j).getText());
                }
            }
        }
        Actions builder = new Actions(driver);

        for (WebElement picture : productsPicture) {
            Action action = builder.moveToElement(picture).build();
            action.perform();

            screenShot();
        }
    }

    public void dropDown() {

        selectOptions(lDropDownKategorie);
    }

    public void orderBy() {

        selectOptions(lOrderOptions);
    }

    public void quitDriver() {
        driver.quit();
    }

}
