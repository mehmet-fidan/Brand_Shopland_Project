package pages;

import jdk.jshell.tool.JavaShellToolBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.ParentClass;

import java.util.List;

public class FilterPage extends ParentClass {


    By lFilterButton = By.cssSelector("button[class='button astra-shop-filter-button']");

    By lColorFilterButton = By.cssSelector("li input[placeholder='Variation Farbe wählen']");
    By lKriteriaFilterButton = By.cssSelector("li input[placeholder*='wählen']");
    By lFilterForAll = By.cssSelector("ul li[class='select2-results__option']");

    By lSizeFilterButton = By.cssSelector("li input[placeholder='Variation Grösse wählen']");
    By lMaterialFilterButton = By.cssSelector("li input[placeholder='Variation Material wählen']");
    By lGenderFilterButton = By.cssSelector("li input[placeholder='Variation Gender wählen']");

    By lJetzFiltern = By.cssSelector("button[value='Jetzt filtern...']");

    By lJetzFiltern2 = By.cssSelector("div[id='woocommerce_layered_nav-2'] button[value='Jetzt filtern...']");
    By lJetzFiltern3 = By.cssSelector("div[id='woocommerce_layered_nav-3'] button[value='Jetzt filtern...']");
    By lJetzFiltern4 = By.cssSelector("div[id='woocommerce_layered_nav-4'] button[value='Jetzt filtern...']");
    By lJetzFiltern5 = By.cssSelector("div[id='woocommerce_layered_nav-7'] button[value='Jetzt filtern...']");

    By lscrol = By.xpath("//h2[text()='Filtern nach Grösse']");


    public void colorFilter() {
         filterButton();
        clickTo(lColorFilterButton);
        filter(lFilterForAll);
        clickTo(lJetzFiltern2);
        filterButton();
        clickTo(lSizeFilterButton);
        filter(lFilterForAll);
        clickTo(lJetzFiltern3);
        filterButton();
        clickTo(lMaterialFilterButton);
        filter(lFilterForAll);
        clickTo(lJetzFiltern4);
        driver.navigate().back();
        filterButton();
        clickTo(lGenderFilterButton);
        filter(lFilterForAll);
       // scroll();
        clickTo(lJetzFiltern5);

    }

    public void canta(){
        filterButton();
        clickTo(lMaterialFilterButton);
        filter(lFilterForAll);
        clickTo(lJetzFiltern4);
        driver.navigate().back();
        filterButton();
    }


    public void filterAll() {

        List<WebElement> allFilters = driver.findElements(lKriteriaFilterButton);
        List<WebElement> jetzFiltern = driver.findElements(lJetzFiltern);

        for (int i = 0; i < allFilters.size(); i++) {
            clickTo(lFilterButton);
            sleep(2000);
            allFilters.get(i).click();
            List<WebElement> filterOption = driver.findElements(lFilterForAll);
            filterOption.get(randomNum(filterOption.size())).click();
            jetzFiltern.get(i).click();
        }
    }

    public void filter(By locator) {
        List<WebElement> filterOption = driver.findElements(locator);
        System.out.println(randomNum(filterOption.size()));
        filterOption.get(randomNum(filterOption.size())).click();
        sleep(2000);

    }

    public void filterButton() {
        clickTo(lFilterButton);
        sleep(2000);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("arguments[0].scrollIntoView(true);",lscrol);
        js.executeScript("arguments[0].scrollIntoView(true);",lJetzFiltern4);
    }


}
