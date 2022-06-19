$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/tests/HerokuLogin.feature");
formatter.feature({
  "name": "Heroku Login Feature",
  "description": "  Description: testam login si logout pe pagina Heroku",
  "keyword": "Feature"
});
formatter.background({
  "name": "# se ruleaza inainte de fiecare scenariu de test",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login: I am on the Heroku Login page URL https://the-internet.herokuapp.com/login",
  "keyword": "Given "
});
formatter.match({
  "location": "HerokuLoginSteps.open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "testam login si logout cu credentiale corecte",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Login: I enter user tomsmith",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.input_user(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: I enter password SuperSecretPassword!",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.input_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: When i click log in btn",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.click_log_in_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Secure: When i click log out btn",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuSecureSteps.click_log_out_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: Message is displayed You logged out of the secure area!",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuLoginSteps.mssg_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: I click close btn",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.click_close_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: Message is Not displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuLoginSteps.mssg_is_not_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "testam login cu credentiale invalide",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Login: I enter user \u003cuser\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Login: I enter password \u003cpass\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Login: When i click log in btn",
  "keyword": "When "
});
formatter.step({
  "name": "Login: Message is displayed Your username is invalid!",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "abc",
        "123"
      ]
    },
    {
      "cells": [
        "efg",
        "456"
      ]
    }
  ]
});
formatter.background({
  "name": "# se ruleaza inainte de fiecare scenariu de test",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login: I am on the Heroku Login page URL https://the-internet.herokuapp.com/login",
  "keyword": "Given "
});
formatter.match({
  "location": "HerokuLoginSteps.open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "testam login cu credentiale invalide",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Login: I enter user abc",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.input_user(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: I enter password 123",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.input_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: When i click log in btn",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.click_log_in_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: Message is displayed Your username is invalid!",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuLoginSteps.mssg_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "# se ruleaza inainte de fiecare scenariu de test",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login: I am on the Heroku Login page URL https://the-internet.herokuapp.com/login",
  "keyword": "Given "
});
formatter.match({
  "location": "HerokuLoginSteps.open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "testam login cu credentiale invalide",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Login: I enter user efg",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.input_user(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: I enter password 456",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.input_pass(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: When i click log in btn",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuLoginSteps.click_log_in_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login: Message is displayed Your username is invalid!",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuLoginSteps.mssg_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
});