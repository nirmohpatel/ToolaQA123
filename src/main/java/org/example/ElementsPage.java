package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class ElementsPage extends Util
{
    SoftAssert softAssert = new SoftAssert();
    private String expectedText = "Elements";
    private By _actualText = By.xpath("//div[@class=\"main-header\"]");
    private By _textBoxButton = By.xpath("//div[@class=\"accordion\"]/div[1]/div[1]/ul[1]/li[1]");
    private By _checkBoxButton = By.xpath("//div[@class=\"accordion\"]/div[1]/div[1]/ul[1]/li[2]");
    private By _radioButton = By.xpath("//div[@class=\"accordion\"]/div[1]/div[1]/ul[1]/li[3]");
    private By _webTablesButton = By.xpath("//div[@class=\"accordion\"]/div[1]/div[1]/ul[1]/li[4]");
    private By _buttonsPageButton = By.xpath("//div[@class=\"accordion\"]/div[1]/div[1]/ul[1]/li[5]");
    private By _linksPageButton = By.xpath("//div[@class=\"accordion\"]/div[1]/div[1]/ul[1]/li[6]");
    private By _brokenLinksImagesPageButton = By.xpath("//div[@class=\"accordion\"]/div[1]/div[1]/ul[1]/li[7]");

    public void toVerifyThatUserIsOnElementsPage()
    {
        softAssert.assertEquals(getTextFromElement(_actualText), expectedText, "User is on ElementsPage");
        softAssert.assertAll("User is not on ElementsPage.");
    }
    public void clickOnTextBoxButton()
    {
        clickOnElement(_textBoxButton);
    }

    public void clickOnCheckBoxButton()
    {
        clickOnElement(_checkBoxButton);
    }

    public void clickOnRadioButton()
    {
        clickOnElement(_radioButton);
    }

    public void clickOnWebTablesButton()
    {
        clickOnElement(_webTablesButton);
    }

    public void clickOnButtonPageButton() { javaScriptClickOnElement(_buttonsPageButton);}

    public void clickOnLinksPageButton(){ javaScriptClickOnElement(_linksPageButton);}

    public void clickOnBrokenLinksImagesPageButton(){ javaScriptClickOnElement(_brokenLinksImagesPageButton);}
}
