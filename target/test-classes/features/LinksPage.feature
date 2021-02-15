@LinksPage
Feature: User click on links button successfully

  Scenario: User should be able to click on appropriate Link to open new tab successfully
    Given user is on Links page
    When User click on Appropriate link to open new tab
    Then User should be able to see new tab open successfully
    When User click on appropriate link
    Then User should be able to see response massage successfully
