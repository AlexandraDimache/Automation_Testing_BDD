Feature: Heroku Login Feature
  Description: testam login si logout pe pagina Heroku

  Background: # se ruleaza inainte de fiecare scenariu de test
    Given Login: I am on the Heroku Login page URL https://the-internet.herokuapp.com/login

  Scenario: testam login si logout cu credentiale corecte
    When Login: I enter user tomsmith
    When Login: I enter password SuperSecretPassword!
    When Login: When i click log in btn
    When Secure: When i click log out btn
    Then Login: Message is displayed You logged out of the secure area!
    When Login: I click close btn
    Then Login: Message is Not displayed

    #ne permite sa dam un tabel de valori
  Scenario Outline: testam login cu credentiale invalide
    When Login: I enter user <user>
    When Login: I enter password <pass>
    When Login: When i click log in btn
    Then Login: Message is displayed Your username is invalid!

    Examples:
      | user       | pass  |
      | abc        | 123   |
      | efg        | 456   |