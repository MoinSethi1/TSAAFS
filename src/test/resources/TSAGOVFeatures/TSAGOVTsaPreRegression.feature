#Author: your.email@your.domain.com

Feature: TSAPre section regression test
	
  Scenario: As user I want to access all pages on TSAPre section
    Given user wants to access all pages on TSAPre section
    When user access TSAPre page
    Then user is directed to TSAPre page
    And all pages under TSAPre section are accessible

 