Feature: Login Function

#Scenario: Valid Login
#Given suer is on login page
#When user enters login creadentials
#Then user should be navigated to Home Page


#Scenario: Valid Login
#Given suer is on login page
#When user enters "tomsmith" and "SuperSecretPassword!"
#Then user should be navigated to Home Page


#Scenario Outline: Valid Login
#Given suer is on login page
#When user enters "<username>" and "<password>"
#Then user should be navigated to Home Page


#Examples:

#| username | password |
#| testuser1 | password1 |
#| testuser2 | password2 |
#| tomsmith | SuperSecretPassword! |


#Scenario: Valid Login
#Given suer is on login page
#When user enters login creadentials
#| tomsmith | SuperSecretPassword! |
#Then user should be navigated to Home Page


Scenario: Valid Login
Given suer is on login page
When user enters login creadentials
| username | password |
| tomsmith | SuperSecretPassword! |
| user1 | password1! |
Then user should be navigated to Home Page