package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class CheckBoxPage extends Util
{
    SoftAssert softAssert = new SoftAssert();

    private String expectedText3 = "Check Box";
    private String expectedTextMassage = "You have selected :";

    private By _actualText3 = By.xpath("//div[@class=\"main-header\"]");
    private By _clickCheckBox = By.xpath("//span[@class=\"rct-checkbox\"]");
    private By _actualTextMassage = By.xpath("//div[@id=\"result\"]/span[1]");

    public void toVerifyThatUserIsOnCheckBoxPage()
    {
        softAssert.assertEquals(getTextFromElement(_actualText3), expectedText3);
        softAssert.assertAll("User is not on Check Box Page");
    }

    public void clickOnCheckBox () { clickOnElement(_clickCheckBox); }

    public void toVerifyThatUserSuccessfullyClickOnCheckBox()
    {
        softAssert.assertEquals(getTextFromElement(_actualTextMassage), expectedTextMassage);
        softAssert.assertAll("User have not click on check box successfully");
    }
}
