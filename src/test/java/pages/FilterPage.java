package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.ParentClass;

import java.util.List;

public class FilterPage extends ParentClass {


    By lFilterButton = By.cssSelector("button[class='button astra-shop-filter-button']");
    By lMainKriteriasFilter = By.cssSelector("li[class='select2-search select2-search--inline']");
    By lInnerFilterKriterias = By.cssSelector("ul li[class='select2-results__option']");

    By lJetzFilternButton = By.cssSelector("button[value='Jetzt filtern...']");
    By lKeineProdukte = By.xpath("(//p[contains(text(),'keine Produkte')])[5]");


    By lPriceSliderLeft = By.cssSelector("div span[style='left: 0%;']");
    By lPriceSliderRight = By.cssSelector("div span[style='left: 100%;']");
    By lPriceAmountButton = By.cssSelector(".price_slider_amount button[class='button']");


    public void filterAll() {

        List<WebElement> mainKriterias = driver.findElements(lMainKriteriasFilter);
        List<WebElement> jetzFiltern;

        for (int i = 0; i < mainKriterias.size(); i++) {
            mainKriterias = driver.findElements(lMainKriteriasFilter);
            mainKriterias.get(i).click();

            List<WebElement> filterOption = driver.findElements(lInnerFilterKriterias);
            filterOption.get(randomNum(filterOption.size())).click();

            jetzFiltern = driver.findElements(lJetzFilternButton);
            jetzFiltern.get(i).click();

            if (driver.findElement(lKeineProdukte).isDisplayed()) {
                driver.navigate().back();
                filterButton();
            } else {
                filterButton();
            }
        }
    }

    public void filterButton() {
        clickTo(lFilterButton);
        sleep(1000);
    }


    public void priceFilter() {
        WebElement leftSlider = driver.findElement(lPriceSliderLeft);
        WebElement rightSlider = driver.findElement(lPriceSliderRight);

        Actions builder = new Actions(driver);
        Action actionLeft = builder.dragAndDropBy(leftSlider, 30, 0).build();
        Action actionRight = builder.dragAndDropBy(rightSlider, -60, 0).build();

        actionLeft.perform();
        actionRight.perform();

        clickTo(lPriceAmountButton);
        filterButton();
    }


}
