$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/BrokenLinkPage.feature");
formatter.feature({
  "line": 2,
  "name": "User click on broken links - images button successfully",
  "description": "",
  "id": "user-click-on-broken-links---images-button-successfully",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BrokenLinksImagesPage"
    }
  ]
});
formatter.before({
  "duration": 11204937500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to click on appropriate links - images to open Tab successfully",
  "description": "",
  "id": "user-click-on-broken-links---images-button-successfully;user-should-be-able-to-click-on-appropriate-links---images-to-open-tab-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Broken links images page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on valid link to open tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be able to see Home Page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on broken link to open tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should be able to see broken link response massage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_Broken_links_images_page()"
});
formatter.result({
  "duration": 1052842900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_valid_link_to_open_tab()"
});
formatter.result({
  "duration": 1112090700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_able_to_see_Home_Page_successfully()"
});
formatter.result({
  "duration": 30351600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_broken_link_to_open_tab()"
});
formatter.result({
  "duration": 2353035800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_able_to_see_broken_link_response_massage_successfully()"
});
formatter.result({
  "duration": 27743800,
  "status": "passed"
});
formatter.after({
  "duration": 35000,
  "status": "passed"
});
});