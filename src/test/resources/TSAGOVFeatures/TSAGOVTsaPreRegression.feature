
Feature: TSAPre section regression test
	
  Scenario Outline: As user I want to access all pages under TSAPre section
    Given user wants to access all pages on TSAPre section
    When user access TSAPre page
    Then user is directed to TSAPre page
    And page <pageName> under TSAPre section is accessible

Examples:
|pageName								|
|Airport Airlines				|
|Schedule								|
|FAQ										|
|Trusted Traveler Programs|

 