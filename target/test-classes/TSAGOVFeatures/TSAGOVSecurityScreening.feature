Feature: Security Screening section regression test
 Scenario Outline: As user I want to access pages under Security Screening section
    Given user wants to access all pages on Security Screening section
    When user access Security Screening page
    Then user is directed to Security Screening page
    And page <pageName> under Security Screening is accessible

    Examples: 
      |pageName				|  
      |Identification	| 
      |Liquids Rule	|
			|Emerging Technology				|	
			|REAL ID						|