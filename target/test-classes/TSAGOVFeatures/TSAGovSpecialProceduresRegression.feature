Feature: What can I Bring? section regression test
	
  Scenario Outline: As user I want to access all pages under Special Procedure section
    Given user wants to access all pages under Special Procedure section
    When user access Special Procedure page
    Then user is directed to Special Procedure page
    And page <pageName> under Special Procesdure is accessible
    
    Examples:
    |pageName												|
   	|Disabilities Medical Conditions|
   	|Military												|
   	|Children												|
   	|Seniors												|
   	|Law Enforcement								|
   	|Cultural												|

  