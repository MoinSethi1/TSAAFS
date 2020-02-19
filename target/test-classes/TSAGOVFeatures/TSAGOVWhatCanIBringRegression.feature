#Author: your.email@your.domain.com

Feature: What can I Bring? section regression test
	
  Scenario: As user I want to access all pages on What Can I Bring? section
    Given user wants to access all pages on What Can I Bring section
    When user access What Can I Bring? page
    Then user is directed to What Can I Bring page
    And all sections on this page are accessible

  
