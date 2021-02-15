@TextBoxPage
Feature: User add personal data successfully
  Scenario: User should be able to enter personal data successfully
    Given User is on TextBoxPage
    When User enter all personal data
    And User click on submit Button
    Then User able to see all personal data add successfully
