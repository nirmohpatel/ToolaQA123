@BrokenLinksImagesPage
Feature: User click on broken links - images button successfully

  Scenario: User should be able to click on appropriate links - images to open Tab successfully
    Given user is on Broken links images page
    When User click on valid link to open tab
    Then User should be able to see Home Page successfully
    When User click on broken link to open tab
    Then User should be able to see broken link response massage successfully