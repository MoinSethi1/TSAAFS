Feature: Industry section regression test
	
  Scenario Outline: As user I want to access all pages under Industry section
    Given user wants to access all pages on Industry section
    When user access Industry pages
 		Then page <pageName> under Industry section is accessible

Examples:
|pageName								|
|Industry			|
|Cargo Programs							|
