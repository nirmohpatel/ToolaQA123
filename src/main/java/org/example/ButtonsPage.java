package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class ButtonsPage extends Util
{
    SoftAssert softAssert = new SoftAssert();
    public static LoadProperty loadProperty = new LoadProperty();
    public static String ButtonPage = loadProperty.getProperty("ButtonPage");

    private String expectedButtonPageHeaderText = "Buttons";
    private String expectedDoubleClickMeMassage = "You have done a double click";
    private String expectedRightClickMeMassage = "You have done a right click";
    private String expectedClickMeMassage = "You have done a dynamic click";

    private By _actualButtonPageHeaderText = By.xpath("//div[@class=\"main-header\"]");
    private By _doubleClickMeButton = By.xpath("//button[@id=\"doubleClickBtn\"]");
    private By _rightClickMeButton = By.xpath("//button[@id=\"rightClickBtn\"]");
    private By _clickMeButton = By.xpath("//div [@class=\"col-12 mt-4 col-md-6\"]/div/div[3]/button");
    private By _actualDoubleClickMeMassage = By.xpath("//p[@id=\"doubleClickMessage\"]");
    private By _actualRightClickMeMassage = By.xpath("//p[@id=\"rightClickMessage\"]");
    private By _actualClickMeMassage = By.xpath("//p[@id=\"dynamicClickMessage\"]");

    public void toVerifyThatUserIsOnButtonPagePage()
    {
        softAssert.assertEquals(getTextFromElement(_actualButtonPageHeaderText),expectedButtonPageHeaderText);
        softAssert.assertAll("User is not on Button Page");
    }

    public void clickAppropriateButton()
    {
        if (ButtonPage.equalsIgnoreCase("Double Click Me"))
        {
            doubleClickOnElement(_doubleClickMeButton);
        } else if (ButtonPage.equalsIgnoreCase("Right Click Me"))
        {
            rightClickOnElement(_rightClickMeButton);
        } else if (ButtonPage.equalsIgnoreCase("Click Me"))
        {
            clickOnElement(_clickMeButton);
        } else
            { System.out.println("User have not click on Appropriate Button");
            }
    }

    public void toVerifyThatUserSuccessfullyClickOnButton ()
    {
        if (ButtonPage.equalsIgnoreCase("Double Click Me"))
        {
            softAssert.assertEquals(getTextFromElement(_actualDoubleClickMeMassage),expectedDoubleClickMeMassage);
            softAssert.assertAll("User have not click on Double Click Me Button");

        }else if (ButtonPage.equalsIgnoreCase("Right Click Me"))
        {
            softAssert.assertEquals(getTextFromElement(_actualRightClickMeMassage),expectedRightClickMeMassage);
            softAssert.assertAll("User have not click on Right Click Me Button");
        } else if (ButtonPage.equalsIgnoreCase("Click Me"))
        {
            softAssert.assertEquals(getTextFromElement(_actualClickMeMassage),expectedClickMeMassage);
            softAssert.assertAll("User have not click on Click Me Button");
        } else {
            System.out.println("User have not click on Appropriate successfully");
        }
    }

}
