package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ParentClass;

import java.util.List;

public class SearchFieldPage extends ParentClass {


    @FindBy(xpath = "(//div[@class='ast-search-icon']//a[@aria-label='Search icon link'])[1] ")
    WebElement eMenubarSearchFieldButton;

    @FindBy(css = "#ast-search-form input")
    WebElement eMenubarSearchField;

    @FindBy(css = "h2[class='entry-title'] a")
    List<WebElement> eResultVerification;

    @FindBy(id = "wp-block-search__input-1")
    WebElement eLeftSideSearchField;

    @FindBy(css = "svg[id='search-icon']")
    WebElement eLeftSideSearchFieldButton;


    public SearchFieldPage() {

        PageFactory.initElements(driver, this);
    }


    public void menuBarSearchField() {
        eMenubarSearchFieldButton.click();
        eMenubarSearchField.sendKeys("black", Keys.ENTER);
    }

    public void verifyMenuBarSearchText() {

        for (WebElement searchResultText : eResultVerification) {
            System.out.println(searchResultText.getText());
        }
    }

    public void leftSideSearchField(){
        eLeftSideSearchField.clear();
        eLeftSideSearchField.sendKeys("blue");
        eLeftSideSearchFieldButton.click();

    }

}
