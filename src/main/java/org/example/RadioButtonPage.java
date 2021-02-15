package org.example;

import javafx.scene.control.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class RadioButtonPage extends Util
{
    SoftAssert softAssert = new SoftAssert();
    public static LoadProperty loadProperty = new LoadProperty();
    public static String RadioButton = loadProperty.getProperty("RadioButton");

    private String expectedText4 = "Radio Button";
    private String expectedTextMassageForYes = "You have selected Yes";
    private String expectedTextMassageForImpressive = "You have selected Impressive";

    private By _actualText4 = By.xpath("//div[@class=\"main-header\"]");
    private By _selectYes = By.xpath("//label[@for=\"yesRadio\"] ");
    private By _selectImpressive = By.xpath("//label[@for=\"impressiveRadio\"] ");
    private By _actualTextMassageForYes = By.xpath("//p[@class=\"mt-3\"]");
    private By _actualTextMassageForImpressive = By.xpath("//p[@class=\"mt-3\"]");


    public void toVerifyThatUserIsOnRadioButtonPage()
    {
        softAssert.assertEquals(getTextFromElement(_actualText4), expectedText4);
        softAssert.assertAll("User is not on Radio button Page");
    }

    public void selectRadioButton ()
    {
     if (RadioButton.equalsIgnoreCase("yes"))
        {
        clickOnElement(_selectYes);
        } else if (RadioButton.equalsIgnoreCase("Impressive"))
        {
            clickOnElement(_selectImpressive);
        } else
            {
                System.out.println(" Please select Radio button");
            }

    }

    public void toVerifyThatUserSuccessfullySelectRadioButton()
    {
        if (RadioButton.equalsIgnoreCase("yes"))
        {
            softAssert.assertEquals(getTextFromElement(_actualTextMassageForYes), expectedTextMassageForYes);
            softAssert.assertAll("User have not click on check box successfully");

        }else if(RadioButton.equalsIgnoreCase("Impressive"))
        {
            softAssert.assertEquals(getTextFromElement(_actualTextMassageForImpressive), expectedTextMassageForImpressive);
            softAssert.assertAll("User have not click on check box successfully");
        } else
            {
                System.out.println("User have not click on check box successfully");
            }

    }


}
