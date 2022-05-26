Feature: Deals Functions
user can create contact, edit/ view / delete Deals


Scenario: Create Deals
Given user must have logged in
When user create a new Deals 

Scenario: View Deals
Given user must have logged in
When user view Deals details

@RegressionTest
Scenario: Edit Deals
Given user must have logged in
When user edit Deals details

@SmokeTest
Scenario: Delete Deals
Given user must have logged in
When user delete Deals 