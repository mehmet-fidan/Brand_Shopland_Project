package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;
import java.util.Set;

public class CompareProductPage extends ParentClass {

    By lListOfProducts = By.cssSelector("li div a h2");

    By lAddComparisonBoxButton = By.cssSelector("a[class='compare']");

    By lComparisonBoxCloseButton = By.cssSelector("button[id='cboxClose']");

    By lNextProductButton = By.cssSelector("a i[class='ast-icon-next']");
    By lPreviousProductButton = By.cssSelector("a i[class='ast-icon-previous']");
    By lComparisonListSize = By.cssSelector("tr[class='description even'] td");
    By lComparisonListButton = By.xpath("//div[text()='Vergleichsliste']");
    By lProductsNamesInComparisonList = By.cssSelector("tr[class='title odd'] td");
    By lAddedProductsName = By.cssSelector("div h1");

    String firstProductName;
    String secondProductName;


    public void FirstProdAdditionToCompList() {
        List<WebElement> productList = driver.findElements(lListOfProducts);
        productList.get(randomNum(productList.size())).click();
        firstProductName = driver.findElement(lAddedProductsName).getText();
        System.out.println("Added first Product's name: " + firstProductName);

        scroll("window.scrollBy(0,400)");

        clickTo(lAddComparisonBoxButton);
        sleep(2000);
        clickTo(lComparisonBoxCloseButton);
        sleep(2000);
    }

    public void SecondProdAdditionToCompList() {

        scroll("window.scrollBy(0,-document.body.scrollHeight)");
        clickTo(lNextProductButton);
        secondProductName = driver.findElement(lAddedProductsName).getText();
        System.out.println("Added second product's name: " + secondProductName);
        clickTo(lAddComparisonBoxButton);
        clickTo(lComparisonBoxCloseButton);
        sleep(2000);
    }

    public void verifyProductAddition() {
        clickTo(lComparisonListButton);
        windowHandle(lComparisonListSize, lProductsNamesInComparisonList);
    }

    public void windowHandle(By locator, By locator2) {

        String anasayfaId = driver.getWindowHandle();
        Set<String> listId = driver.getWindowHandles();


        for (String currentWindowId : listId) {
            if (currentWindowId.equals(anasayfaId)) continue;
            driver.switchTo().window(currentWindowId);
            List<WebElement> element = driver.findElements(locator);
            List<WebElement> element2 = driver.findElements(locator2);

            Assert.assertEquals(element2.get(0).getText(), firstProductName);
            Assert.assertEquals(element2.get(1).getText(), secondProductName);

            /* for (WebElement webElement : element2) {
                System.out.println(webElement.getText());
            }
             */
            System.out.println(element.size());
            driver.close();
        }
        driver.switchTo().window(anasayfaId);
    }

}
