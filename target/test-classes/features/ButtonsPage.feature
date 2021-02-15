@ButtonPage
Feature: User click on button successfully
  Scenario: User should be able to click on appropriate button successfully
    Given User is on Button page
    When User click on appropriate button
    Then User should be able to see selected button massage successfully