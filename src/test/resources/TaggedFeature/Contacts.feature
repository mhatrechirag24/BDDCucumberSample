@PhaseOne
Feature: Contact Functions
user can create contact, edit/ view / delete contact

Background: Login into APP
Given user must have logged in

@RegressionTest @SmokeTest
Scenario: Create contact
#Given user must have logged in
When user create a new contact 

Scenario: View contact
#Given user must have logged in
When user view contact details

@RegressionTest
Scenario: Edit contact
#Given user must have logged in
When user edit contact details

@SmokeTest
Scenario: Delete contact
#Given user must have logged in
When user delete contact 