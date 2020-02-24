#Author:moinpreet.sethi

Feature: Travel Tips section regression test
	
  Scenario Outline: As user I want to access all pages on Travel Tips section
    Given user wants to access all pages on Travel Tips section
    When user access Travel Tips page
    Then user is directed to Travel Tips page
    And page <pageName> on Travel Tips section is accessible
    
Examples:
|pageName					|
|Travel Checklist			|