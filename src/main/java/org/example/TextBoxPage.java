package org.example;

import com.sun.javafx.image.impl.ByteArgb;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TextBoxPage extends Util
{
    SoftAssert softAssert = new SoftAssert();
    LoadProperty loadProperty = new LoadProperty();

    private String expectedText = "Text Box";
    private String expectedFullNameText = "Name:Sam";

    private By _actualText = By.xpath("//div[@class=\"main-header\"]");
    private By _fullName = By.xpath("//input[@id=\"userName\"]");
    private By _email = By.xpath("//input[@id=\"userEmail\"]");
    private By _currentAddress = By.xpath("//textarea[@id=\"currentAddress\"]");
    private By _permanentAddress = By.xpath("//textarea[@id=\"permanentAddress\"]");
    private By _submitButton = By.xpath("//button[@id=\"submit\"]");
    //private By _actualFullName = By.linkText("sam");
    private By _actualFullName = By.xpath("//div[@class=\"border col-md-12 col-sm-12\"]/p[1]");


    public void toVerifyUserIsOnTextBoxPage()
    {
        softAssert.assertEquals(getTextFromElement(_actualText),expectedText,"User is on Text Box Page");
        softAssert.assertAll("User is not on Text Box Page");
    }
    public void userEnterPersonalData ()
    {
        typeText(_fullName,loadProperty.getProperty("FullName"));
        typeText(_email,loadProperty.getProperty("Email"));
        typeText(_currentAddress,loadProperty.getProperty("CurrentAddress"));
        typeText(_permanentAddress,loadProperty.getProperty("PermanentAddress"));
    }

    public void userClickOnSubmitButton()
    {
        javaScriptClickOnElement(_submitButton);
        //waitUntilElementIsClickAble(_submitButton,60);
        //clickOnElement(_submitButton);
    }

    public void toVerifyThatUserAbleToSeeAllPersonalDataAddSuccessfully()
    {
        softAssert.assertEquals(getTextFromElement(_actualFullName),expectedFullNameText, "User should be able to add personal data successfully");
        softAssert.assertAll("User should not able to add personal data successfully");
    }
}
