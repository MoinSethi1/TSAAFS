#Author: Moinpreet Sethi

Feature: login into TSA.gov
Scenario: As user I want to login to the TSA.gov application
Given the user opens the TSA.gov application
When user logs into application using credentials
Then user would see the membership information