package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs
{
    HomePage homepage = new HomePage();
    ElementsPage elementsPage = new ElementsPage();
    TextBoxPage textBoxPage = new TextBoxPage();
    CheckBoxPage checkBoxPage = new CheckBoxPage();
    RadioButtonPage radioButtonPage = new RadioButtonPage();
    WebTablesPage webTablesPage = new WebTablesPage();
    ButtonsPage buttonsPage = new ButtonsPage();
    LinksPage linksPage = new LinksPage();
    BrokenLinksPage brokenLinksPage = new BrokenLinksPage();


    // Method for Element page

        @Given("^User is on HomePage$")
        public void user_is_on_HomePage()
    { homepage.toVerifyThatUserIsOnHomePage();}

        @When("^User click on Elements$")
        public void user_click_on_Elements()
    {
        homepage.clickOnElementsButton();
    }

        @Then("^User should be able to see ElementPage successfully$")
        public void user_should_be_able_to_see_ElementPage_successfully()
    {
        elementsPage.toVerifyThatUserIsOnElementsPage();
    }

    @And("^User click on TextBox button$")
    public void userClickOnTextBoxButton()
    {
        elementsPage.clickOnTextBoxButton();
    }

    // Method for Text Box Page

    @Given("^User is on TextBoxPage$")
    public void user_is_on_TextBoxPage()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnTextBoxButton();
        textBoxPage.toVerifyUserIsOnTextBoxPage();
    }
    @When("^User enter all personal data$")
    public void user_enter_all_personal_data()
    {
       textBoxPage.userEnterPersonalData();
    }

    @When("^User click on submit Button$")
    public void user_click_on_submit_Button()
    {

        textBoxPage.userClickOnSubmitButton();
        webTablesPage.clickOnSubmitButtonOnRegistrationPage();
    }

    @Then("^User able to see all personal data add successfully$")
    public void user_able_to_see_all_personal_data_add_successfully()
    {
        textBoxPage.toVerifyThatUserAbleToSeeAllPersonalDataAddSuccessfully();
    }

    // Method for Check Box Page
    @Given("^User is on check box page$")
    public void user_is_on_check_box_page()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnCheckBoxButton();
        checkBoxPage.toVerifyThatUserIsOnCheckBoxPage();
    }

    @When("^User click on Check box$")
    public void user_click_on_Check_box()
    {
        checkBoxPage.clickOnCheckBox();
    }

    @Then("^User should be able to see success massage$")
    public void user_should_be_able_to_see_successfully()
    {
       checkBoxPage.toVerifyThatUserSuccessfullyClickOnCheckBox();
    }

    // Method for Radio Button Page
    @Given("^User is on Radio button page$")
    public void user_is_on_Radio_button_page()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnRadioButton();
        radioButtonPage.toVerifyThatUserIsOnRadioButtonPage();
    }

    @When("^User select appropriate Radio button$")
    public void user_select_appropriate_Radio_button()
    {
        radioButtonPage.selectRadioButton();
    }

    @Then("^User should be able to see Radio button selected massage successfully$")
    public void user_should_be_able_to_see_Radio_button_selected_massage_successfully()
    {
        radioButtonPage.toVerifyThatUserSuccessfullySelectRadioButton();
    }

    // Method for Web Tables Page

    @Given("^User is on Web table Page$")
    public void user_is_on_Web_table_Page()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnWebTablesButton();
        webTablesPage.toVerifyThatUserIsOnWebTablesPage();

    }

    @When("^User click on Add button$")
    public void user_click_on_Add_button()
    {
       webTablesPage.clickOnAddButton();
    }

    @When("^User enter appropriate registration  data$")
    public void user_enter_appropriate_registration_data()
    {
        webTablesPage.userEnterRegistrationFormDetails();
    }

    @When("^User click on submit Button on registration page$")
    public void user_click_on_submit_Button_on_registration_page()
    {
        webTablesPage.clickOnSubmitButtonOnRegistrationPage();
    }

    @Then("^User should be able to Register successfully$")
    public void user_should_be_able_to_Register_successfully()
    {
        webTablesPage.toVerifyThatUserRegisterSuccessfully();
    }

    // Method for Button Page

    @Given("^User is on Button page$")
    public void user_is_on_Button_page()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnButtonPageButton();
        buttonsPage.toVerifyThatUserIsOnButtonPagePage();
    }

    @When("^User click on appropriate button$")
    public void user_click_on_appropriate_button()
    {
        buttonsPage.clickAppropriateButton();
    }

    @Then("^User should be able to see selected button massage successfully$")
    public void user_should_be_able_to_see_selected_button_massage_successfully()
    {
       buttonsPage.toVerifyThatUserSuccessfullyClickOnButton();
    }

    // Method for Links Page

    @Given("^user is on Links page$")
    public void user_is_on_Links_page()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnLinksPageButton();
        linksPage.toVerifyUserIsOnLinksPage();
    }

   @When("^User click on Appropriate link to open new tab$")
    public void user_click_on_Appropriate_link_to_open_new_tab()
    {
        linksPage.clickOnLinkToOpenNewHomeTab();

    }

    @Then("^User should be able to see new tab open successfully$")
    public void user_should_be_able_to_see_new_tab_open_successfully()
    {
        linksPage.toVerifyUserIsOnHomeTabPage();

    }

   @Given("^User is on The Links page$")
    public void user_is_on_The_Links_page()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnLinksPageButton();
        linksPage.toVerifyUserIsOnLinksPage();
    }

    @When("^User click on appropriate link$")
    public void user_click_on_appropriate_link()
    {
        linksPage.clickAppropriateLinks();
    }

    @Then("^User should be able to see response massage successfully$")
    public void user_should_be_able_to_see_response_massage_successfully()
    {
        linksPage.toVerifyThatUserSuccessfullyClickOnButton();
    }

    // Method for Broken Links Page

    @Given("^user is on Broken links images page$")
    public void user_is_on_Broken_links_images_page()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnBrokenLinksImagesPageButton();
        brokenLinksPage.toVerifyUserIsOnBrokenLinksImagesPage();
    }

    @When("^User click on valid link to open tab$")
    public void user_click_on_valid_link_to_open_tab()
    {
       brokenLinksPage.clickOnValidLink();
    }

    @Then("^User should be able to see Home Page successfully$")
    public void user_should_be_able_to_see_Home_Page_successfully()
    {
       brokenLinksPage.toVerifyUserIsOnValidLinkPage();
    }

    @When("^User click on broken link to open tab$")
    public void user_click_on_broken_link_to_open_tab()
    {
        homepage.clickOnElementsButton();
        elementsPage.clickOnBrokenLinksImagesPageButton();
        brokenLinksPage.toVerifyUserIsOnBrokenLinksImagesPage();
        brokenLinksPage.clickOnBrokenLink();
    }

    @Then("^User should be able to see broken link response massage successfully$")
    public void user_should_be_able_to_see_broken_link_response_massage_successfully()
    {
       brokenLinksPage.toVerifyUserIsOnBrokeLinkPage();
    }
}
