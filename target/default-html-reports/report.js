$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountTypes.feature");
formatter.feature({
  "name": "Account types",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Driver user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user loged in as \"driver\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.ContactsStepDefs.the_user_loged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.NavigationMenuStepDefs.the_user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title contain \"Calendar Events - Activities\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.LoginStepDefs.the_title_contain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Sales manager user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user loged in as \"sales manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.ContactsStepDefs.the_user_loged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates \"Customers\" \"Accounts\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.NavigationMenuStepDefs.the_user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title contain \"Accounts - Customersxxx\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.LoginStepDefs.the_title_contain(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Actual TitleAll - Accounts - Customers\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat com.vytrack.stepDefinitions.LoginStepDefs.the_title_contain(LoginStepDefs.java:72)\r\n\tat ✽.the title contain \"Accounts - Customersxxx\"(file:///C:/Users/fatih/IdeaProjects/seleniumProject/src/test/resources/features/AccountTypes.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Store manager user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user loged in as \"store manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.ContactsStepDefs.the_user_loged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates \"Customers\" \"Contacts\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.NavigationMenuStepDefs.the_user_navigates(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title contain \"Contacts - Customerszzz\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.stepDefinitions.LoginStepDefs.the_title_contain(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Actual TitleAll - Contacts - Customers\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat com.vytrack.stepDefinitions.LoginStepDefs.the_title_contain(LoginStepDefs.java:72)\r\n\tat ✽.the title contain \"Contacts - Customerszzz\"(file:///C:/Users/fatih/IdeaProjects/seleniumProject/src/test/resources/features/AccountTypes.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "screenshot");
formatter.after({
  "status": "passed"
});
});