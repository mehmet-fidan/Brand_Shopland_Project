package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class ParentClass {

    public WebDriver driver;
    public WebDriverWait wait;

    public ParentClass() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void openWebSite(String url) {
        driver.get(url);
    }

    public void clickTo(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendKeys(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void hover(WebElement element) {
        hover(element, 10);
    }

    public void hover(WebElement element, long milis) {
        new Actions(driver).moveToElement(element).pause(milis).build();
    }

    public void sleep(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int randomNum(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }

    public void selectOptions(By locator) {

        WebElement orderKategorie = driver.findElement(locator);

        Select select = new Select(orderKategorie);
        // select.selectByValue("rating");
        //  select.selectByIndex(7);

        List<WebElement> options = select.getOptions();
        int random = randomNum(options.size());
        System.out.println(options.size());
        System.out.println(random);
        System.out.println(options.get(random).getText());
        options.get(random).click();

        sleep(2000);
    }

    public void screenShot(){

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

