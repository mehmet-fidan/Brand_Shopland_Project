package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.ParentClass;

import java.util.List;


public class DropDown extends ParentClass {

    By lDropDownKategorie = By.cssSelector("select[id='product_cat']");
    By lAlleProdukte = By.xpath("(//span//span[text()='Alle Produkte'])[1]");

    public void dropDown (){

        clickTo(lAlleProdukte);
        WebElement dropKategorie = driver.findElement(lDropDownKategorie);

        Select select= new Select(dropKategorie);
       // select.selectByValue("ladies-jewelry");
      //  select.selectByIndex(7);

        List<WebElement> options = select.getOptions();
        options.get(10).click();
    }
}
