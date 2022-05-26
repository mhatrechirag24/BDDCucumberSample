@PhaseTwo
Feature: Tasks Functions
user can create Tasks, edit/ view / delete Tasks


Scenario: Create Tasks
Given user must have logged in
When user create a new Tasks 

@RegressionTest
Scenario: View Tasks
Given user must have logged in
When user view Tasks details

Scenario: Edit Tasks
Given user must have logged in
When user edit Tasks details

Scenario: Delete Tasks
Given user must have logged in
When user delete Tasks 