#Author: your.email@your.domain.com

Feature: What can I Bring? section regression test
	
  Scenario: As user I want to access all pages on What Can I Bring? section
    Given user logged into TSA.gov application
    When user access What Can I Bring? page
    Then user is directed to correct page
    And all pages on this section are accessible

  
