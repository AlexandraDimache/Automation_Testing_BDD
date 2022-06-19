Feature: Forgot Password feature
  Description: Testam optiunea de resetare parola

  Background: # se ruleaza inainte de fiecare scenariu de test
    Given Login: I am on the Login page URL https://www.jules.app/sign-in

   Scenario: User inputs wrong email
     When Login: i clik forgot password link
     When Forgot Pass : I enter email abc.com
     Then Forgot Pass : Button is disabled and error is displayed and correct

   Scenario: User inputs correct email
     When Login: i clik forgot password link
     When Forgot Pass : I enter email andy@email.com
     Then Forgot Pass : Button is enabled and error is not displayed 

