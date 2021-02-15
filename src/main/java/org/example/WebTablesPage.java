package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class WebTablesPage extends Util
{
    SoftAssert softAssert = new SoftAssert();
    public static LoadProperty loadProperty = new LoadProperty();


    private String expectedWebTablesPageHeadersText = "Web Tables";
    private String expectedFirstNameText = "Sam";

    private By _actualWebTablesPageHeadersText = By.xpath("//div[@class=\"main-header\"]");
    private By _addButton = By.xpath("//button[@id=\"addNewRecordButton\"]");
    private By _firstName = By.xpath("//input[@placeholder=\"First Name\"]");
    private By _lastName = By.xpath("//input[@placeholder=\"Last Name\"]");
    private By _userEmail = By.xpath("//input[@placeholder=\"name@example.com\"]");
    private By _age = By.xpath("//input[@placeholder=\"Age\"]");
    private By _salary = By.xpath("//input[@placeholder=\"Salary\"]");
    private By _department = By.xpath("//input[@placeholder=\"Department\"]");
    private By _submitButton = By.xpath("//button[@id=\"submit\"]");
    private By _actualTextFirstName = By.xpath("//div[@class=\"rt-tbody\"]/div[4]/div/div[1]");



    public void toVerifyThatUserIsOnWebTablesPage()
    {
        softAssert.assertEquals(getTextFromElement(_actualWebTablesPageHeadersText),expectedWebTablesPageHeadersText);
        softAssert.assertAll("User is not on Radio button Page");
    }

    public void clickOnAddButton()
    {
        clickOnElement(_addButton);
    }

    public void userEnterRegistrationFormDetails()
    {
        typeText(_firstName,loadProperty.getProperty("FirstName"));
        typeText(_lastName,loadProperty.getProperty("LastName"));
        typeText(_userEmail,loadProperty.getProperty("UserEmail"));
        typeText(_age,loadProperty.getProperty("Age"));
        typeText(_salary,loadProperty.getProperty("Salary"));
        typeText(_department,loadProperty.getProperty("Department"));
    }

    public void clickOnSubmitButtonOnRegistrationPage()
    {
        clickOnElement(_submitButton);
    }

    public void toVerifyThatUserRegisterSuccessfully()
    {
        softAssert.assertEquals(getTextFromElement(_actualTextFirstName),expectedFirstNameText);
        softAssert.assertAll("User is not Register successfully");
    }
}
