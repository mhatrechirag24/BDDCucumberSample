Feature: GooglePage Function

Scenario: Java Search
Given User is on Google Home Page
When User search Java Tutorial
Then should display Java result page
 

Scenario: Selenium Search
Given User is on Google Home Page
When User search Selenium Tutorial
Then should display Selenium result page