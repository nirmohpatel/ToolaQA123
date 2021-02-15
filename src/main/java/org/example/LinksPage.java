package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class LinksPage extends Util
{
    SoftAssert softAssert = new SoftAssert();
    public static LoadProperty loadProperty = new LoadProperty();
    public static String LinksPage = loadProperty.getProperty("LinksPage");
    public static String LinksPageNewTab = loadProperty.getProperty("LinksPageNewTab");

    private String expectedLinksPageHeaderText = "Links";
    private String expectedHomeTabURL = "https://demoqa.com/";
    private String expectedHomeS0H53URL = "https://demoqa.com/";
    private String expectedResponseCodeForCreated = "201";
    private String expectedResponseCodeForNoContent = "204";
    private String expectedResponseCodeForMoved = "301";
    private String expectedResponseCodeForBedRequest = "400";
    private String expectedResponseCodeForUnauthorized = "401";
    private String expectedResponseCodeForForbidden = "403";
    private String expectedResponseCodeForNotFound = "404";

    private By _actualLinksPageHeaderText = By.xpath("//div[@class=\"main-header\"]");
    private By _created = By.xpath("//a[@id=\"created\"]");
    private By _noContent = By.xpath("//a[@id=\"no-content\"]");
    private By _moved = By.xpath("//a[@id=\"moved\"]");
    private By _badRequest = By.xpath("//a[@id=\"bad-request\"]");
    private By _unauthorized = By.xpath("//a[@id=\"unauthorized\"]");
    private By _forbidden = By.xpath("//a[@id=\"forbidden\"]");
    private By _notFound = By.xpath("//a[@id=\"invalid-url\"]");
    private By _actualResponseCodeForAppropriateLink = By.xpath("//p[@id=\"linkResponse\"]/b[1]");
    private By _homeTabButton = By.xpath("//a[@id=\"simpleLink\"]");
    private By _homeS0H53TabButton = By.xpath("//a[@id=\"dynamicLink\"]");


    public void toVerifyUserIsOnLinksPage()
    {
        softAssert.assertEquals(getTextFromElement(_actualLinksPageHeaderText), expectedLinksPageHeaderText, "User is on Links Page");
        softAssert.assertAll("User is not on Links Page");
    }

    public void clickOnLinkToOpenNewHomeTab ()
    {
        if (LinksPageNewTab.equalsIgnoreCase("Home"))
    {
        clickOnElement(_homeTabButton);
    }else if (LinksPageNewTab.equalsIgnoreCase("Home1")) {
        clickOnElement(_homeS0H53TabButton);
    }else {
        System.out.println("user is not able to click");
    }

    }

    public void toVerifyUserIsOnHomeTabPage()
    {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        if (LinksPageNewTab.equalsIgnoreCase("Home"))
        {
        String actualHomeTabUrl = driver.getCurrentUrl();
        softAssert.assertEquals((actualHomeTabUrl),expectedHomeTabURL,"User is on Home Tab Page");
        softAssert.assertAll("user is not on Home Tab Page");

        }else if (LinksPageNewTab.equalsIgnoreCase("Home2"))
        {
            String actualHomeS0H53Url = driver.getCurrentUrl();
            softAssert.assertEquals((actualHomeS0H53Url),expectedHomeS0H53URL,"User is on HomeS0H53 Tab Page");
            softAssert.assertAll("user is not on HomeS0H53 Tab Page");
        } else {

            System.out.println("User is not able to verify new tab ");
        }
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.get("https://demoqa.com/links");
    }

    public void clickAppropriateLinks()
    {
        if (LinksPage.equalsIgnoreCase("Created"))
        {
            clickOnElement(_created);
        }else if (LinksPage.equalsIgnoreCase("No Content"))
        {
            clickOnElement(_noContent);
        }else if (LinksPage.equalsIgnoreCase("Moved"))
        {
            clickOnElement(_moved);
        }else if (LinksPage.equalsIgnoreCase("Bad Request"))
        {
            clickOnElement(_badRequest);
        }else if (LinksPage.equalsIgnoreCase("Unauthorized"))
        {
            clickOnElement(_unauthorized);
        }else if (LinksPage.equalsIgnoreCase("Forbidden"))
        {
            clickOnElement(_forbidden);
        }else if (LinksPage.equalsIgnoreCase("Not Found"))
        {
            clickOnElement(_notFound);
        }else
            {
                System.out.println(" User has not click on appropriate link");
            }
    }

    public void toVerifyThatUserSuccessfullyClickOnButton ()
    {
        if (LinksPage.equalsIgnoreCase("Created"))
        {
            softAssert.assertEquals(getTextFromElement(_actualResponseCodeForAppropriateLink),expectedResponseCodeForCreated);
            softAssert.assertAll("Link has not response with 201");
        }else if (LinksPage.equalsIgnoreCase("No Content"))
        {
            softAssert.assertEquals(getTextFromElement(_actualResponseCodeForAppropriateLink),expectedResponseCodeForNoContent);
            softAssert.assertAll("Link has not response with 204");
        }else if (LinksPage.equalsIgnoreCase("Moved"))
        {
            softAssert.assertEquals(getTextFromElement(_actualResponseCodeForAppropriateLink),expectedResponseCodeForMoved);
            softAssert.assertAll("Link has not response with 301");
        }else if (LinksPage.equalsIgnoreCase("Bad Request"))
        {
            softAssert.assertEquals(getTextFromElement(_actualResponseCodeForAppropriateLink),expectedResponseCodeForBedRequest);
            softAssert.assertAll("Link has not response with 400");
        }else if (LinksPage.equalsIgnoreCase("Unauthorized"))
        {
            softAssert.assertEquals(getTextFromElement(_actualResponseCodeForAppropriateLink),expectedResponseCodeForUnauthorized);
            softAssert.assertAll("Link has not response with 401");
        }else if (LinksPage.equalsIgnoreCase("Forbidden"))
        {
            softAssert.assertEquals(getTextFromElement(_actualResponseCodeForAppropriateLink),expectedResponseCodeForForbidden);
            softAssert.assertAll("Link has not response with 403");
        }else if (LinksPage.equalsIgnoreCase("Not Found"))
        {
            softAssert.assertEquals(getTextFromElement(_actualResponseCodeForAppropriateLink),expectedResponseCodeForNotFound);
            softAssert.assertAll("Link has not response with 404");
        }else
        {
            System.out.println(" User has not click on appropriate link");
        }
    }

}
