package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class BrokenLinksPage extends Util
{
        SoftAssert softAssert = new SoftAssert();

    private String expectedBrokenLinksImagesPageHeaderText = "Broken Links - Images";
    private String expectedValidLinkURL = "https://demoqa.com/";
    private String expectedBrokenLinkURL = "http://the-internet.herokuapp.com/status_codes/500";

    private By _actualBrokenLinksImagesPageHeaderText = By.xpath("//div[@class=\"main-header\"]");
    private By _validLink = By. xpath("//a[@href=\"http://demoqa.com\"]");
    private By _brokenLink = By. xpath("//a[@href=\"http://the-internet.herokuapp.com/status_codes/500\"]");



    public void toVerifyUserIsOnBrokenLinksImagesPage()
    {
        softAssert.assertEquals(getTextFromElement(_actualBrokenLinksImagesPageHeaderText), expectedBrokenLinksImagesPageHeaderText, "User is on Broken Links Page");
        softAssert.assertAll("User is not on Broken Links Page");
    }

    public void clickOnValidLink() { clickOnElement(_validLink); }

    public void clickOnBrokenLink() { javaScriptClickOnElement(_brokenLink); }

    public void toVerifyUserIsOnValidLinkPage() {
        String actualValidLinkUrl = driver.getCurrentUrl();
        softAssert.assertEquals((actualValidLinkUrl), expectedValidLinkURL, "User is on Valid Link Tab");
        softAssert.assertAll("user is not on Valid Link Tab");

    }

    public void toVerifyUserIsOnBrokeLinkPage() {
        String actualBrokenLinkUrl = driver.getCurrentUrl();
        softAssert.assertEquals((actualBrokenLinkUrl), expectedBrokenLinkURL, "User is on Broken Link Tab");
        softAssert.assertAll("user is not on Broken Link Tab");
    }

}
