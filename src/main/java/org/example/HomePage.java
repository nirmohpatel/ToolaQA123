package org.example;


import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage extends Util
{
       SoftAssert softAssert = new SoftAssert();
    private String expectedUrl = "https://demoqa.com/";
    private By _elements = By.xpath("//div[@class=\"category-cards\"]/div[1]/div");

    public void toVerifyThatUserIsOnHomePage()
    {
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals((actualUrl), expectedUrl, "User is on Home Page");
        softAssert.assertAll("User is not on Home Page.");
    }
    public void clickOnElementsButton()
    {
        clickOnElement(_elements);
    }

}
