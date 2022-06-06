package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.ParentClass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

            String fileName = "screenShots" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd.HH.mm.ss"));

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("ScreenShots\\" + fileName + ".png");
            try {
                FileUtils.copyFile(scrFile, destFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void dropDown() {

        selectOptions(lDropDownKategorie);

     /*   WebElement dropKategorie = driver.findElement(lDropDownKategorie);

        Select slct = new Select(dropKategorie);
        // select.selectByValue("ladies-jewelry");
        //  select.selectByIndex(7);

        List<WebElement> options = slct.getOptions();
        int randomKategori = randomNum(options.size());
        System.out.println(options.size());
        System.out.println(randomKategori);
        System.out.println(options.get(randomKategori).getText());
        options.get(randomKategori).click();

      */

    }


    public void orderBy() {

        selectOptions(lOrderOptions);
      /*  WebElement orderOption = driver.findElement(lOrderOptions);

        Select select = new Select(orderOption);

        // select.selectByValue("rating");
        //  select.selectByIndex(7);

        List<WebElement> options = select.getOptions();
        int randomOrder = randomNum(options.size());
        System.out.println(options.size());
        System.out.println(randomOrder);
        System.out.println(options.get(randomOrder).getText());
        options.get(randomOrder).click();
        sleep(2000);
    }

       */

    }
    public void quitDriver() {
        driver.quit();
    }

}
