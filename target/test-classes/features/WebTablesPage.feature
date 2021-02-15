@WebTablesPage
Feature: User Register successfully
  Scenario: User should be able to Register successfully
    Given User is on Web table Page
    When User click on Add button
    And User enter appropriate registration  data
    And User click on submit Button on registration page
    Then User should be able to Register successfully