package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Util extends BasePage
{


    // method for Store the URL value in String
    public static String getURL(){return driver.getCurrentUrl();}

    // method for Clicking action
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // method for Double Clicking action
    public static void doubleClickOnElement (By by)
    {   //Instantiate Action Class
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(by);
        actions.doubleClick(elementLocator).perform();
    }

    public static void rightClickOnElement (By by)
    {   //Instantiate Action Class
        Actions actions = new Actions(driver);

        WebElement link = driver.findElement(by);
        actions.contextClick(link).perform();

    }

    // method for store the text value in string
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // method for enter the text in the box
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    // this explicitly wait method to allow some extra time before action
    public static void waitUntilElementIsClickAble(By by, int TimeInSeconds)
    {       // create WebDriver Object
        WebDriverWait wait = new WebDriverWait(driver, TimeInSeconds);
    }

    //reusable method for click on element in case of other clickable method not work
    public static void javaScriptClickOnElement(By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor javascript = (JavascriptExecutor) driver;
        javascript.executeScript("arguments[0].click();", element);
    }

}
