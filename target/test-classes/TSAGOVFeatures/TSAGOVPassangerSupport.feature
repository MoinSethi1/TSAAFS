
Feature: Passenger Support section regression test
 Scenario Outline: As user I want to access  pages under Passenger Support section
    Given user logged into the application
    When user access Passenger Support page
    Then user is directed to Passenger Support page
    And page <pageName> under Passenger Support is accessible using locator <locatorValue>

    Examples: 
      |pageName				|  
      |Civil Rights		| 
      |Travel Redress	|
			|Claims					|		 