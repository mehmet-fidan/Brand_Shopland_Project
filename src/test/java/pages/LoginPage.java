package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ParentClass;

public class LoginPage extends ParentClass {

    String username = " zeydin.toprak@hotmail.com";
    String password = "toprak.21";

    By lLogin = By.xpath("(//span[text()='Login'][1])");
    By lUsername = By.id("username");
    By lPassword = By.id("password");
    By lLoginButton = By.cssSelector("button[value='Anmelden']");
    By lMeinKonto = By.xpath("(//span//span[text()='Mein Konto '])[1]");
    By lHomePage = By.xpath("(//li//a[@title='Startseite']//span[text()='Home'])[1]");



    public void loginButton() {
        clickTo(lLogin);
    }

    public void toLogin() {
        sendKeys(lUsername, username);
        sendKeys(lPassword, password);
        clickTo(lLoginButton);
    }

    public void loginConfirm() {
         WebElement eKonto = driver.findElement(lMeinKonto);
        Assert.assertEquals(eKonto.getText(),"Mein Konto");
    }

    public void homePage(){
        clickTo(lHomePage);
    }
}
