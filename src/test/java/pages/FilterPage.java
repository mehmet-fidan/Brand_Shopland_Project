package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.ParentClass;

import java.util.List;

public class FilterPage extends ParentClass {


    By lFilterButton = By.cssSelector("button[class='button astra-shop-filter-button']");
    By lMainKriteriasFilter = By.cssSelector("li[class='select2-search select2-search--inline']");
    By lInnerFilterKriterias = By.cssSelector("ul li[class='select2-results__option']");

    By lJetzFilternButton = By.cssSelector("button[value='Jetzt filtern...']");
    By lKeineProdukte = By.xpath("(//p[contains(text(),'keine Produkte')])[5]");


    public void filterAll() {

        List<WebElement> mainKriterias = driver.findElements(lMainKriteriasFilter);
        List<WebElement> jetzFiltern;

        for (int i = 0; i < mainKriterias.size(); i++) {

            mainKriterias = driver.findElements(lMainKriteriasFilter);
            sleep(2000);
            mainKriterias.get(i).click();
            List<WebElement> filterOption = driver.findElements(lInnerFilterKriterias);
            filterOption.get(randomNum(filterOption.size())).click();
            jetzFiltern = driver.findElements(lJetzFilternButton);
            jetzFiltern.get(i).click();
           if(driver.findElement(lKeineProdukte).isDisplayed()){
               driver.navigate().back();
               clickTo(lFilterButton);
           } else {
               clickTo(lFilterButton);
           }
        }
    }


    public void filterButton() {
        clickTo(lFilterButton);
        sleep(2000);
    }

    public void scroll(By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",locator);
    }


}
