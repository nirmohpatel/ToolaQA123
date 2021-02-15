@ElementsPage
  Feature: User should be able to navigate on ElementPage successfully
    Scenario: User should be able to see ElementPage successfully
      Given User is on HomePage
      When User click on Elements
      Then User should be able to see ElementPage successfully
      And User click on TextBox button
