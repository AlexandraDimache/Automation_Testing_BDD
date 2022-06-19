Feature: Login feature for jules.app
    Description: description here

    Background: # se ruleaza inainte de fiecare scenariu de test
        Given Login: I am on the Login page URL https://www.jules.app/sign-in

    Scenario: User enters invalid email => validation error displayed
        When Login: I enter email andy@
        Then Login: Following error is displayed Please enter a valid email address

    Scenario Outline: User enters invalid emails => validation error displayed
        When Login: I enter email <email>
        Then Login: Following error is displayed <error>

        Examples:
            | email       | error                               |
            | andy@email. | Please enter a valid email address! |
            | 12345678910 | Please enter a valid email address! |

