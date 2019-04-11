$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/features/BuscarEnGoogle.feature");
formatter.feature({
  "name": "google search",
  "description": "  I want to search a word in google/ quiero buscar una palabra en google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "successful search in google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "stiven is on google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarEngoogleStepDefinitions.stiven_is_on_google_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he does the search",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarEngoogleStepDefinitions.he_does_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he validates that de result is success",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEngoogleStepDefinitions.he_validates_that_de_result_is_success()"
});
formatter.result({
  "status": "passed"
});
});