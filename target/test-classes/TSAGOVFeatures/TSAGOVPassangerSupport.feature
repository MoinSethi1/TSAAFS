
Feature: Passenger Support section regression test
 Scenario Outline: As user I want to access  pages under Passenger Support section
    Given user wants to access all pages on Passenger Support section
    When user access Passenger Support page
    Then user is directed to Passenger Support page
    And page <pageName> under Passenger Support is accessible

    Examples: 
      |pageName				|  
      |Civil Rights		| 
      |Travel Redress	|
			|Claims					|		 