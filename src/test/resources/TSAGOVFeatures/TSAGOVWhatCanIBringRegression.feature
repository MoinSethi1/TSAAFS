#Author:moinpreet.sethi

Feature: What can I Bring? section regression test
	
  Scenario Outline: As user I want to access all pages on What Can I Bring? section
    Given user wants to access all pages on What Can I Bring section
    When user access What Can I Bring? page
    #Then user is directed to What Can I Bring page
    And page <pageName> on What can I bring section is accessible
    
Examples:
|pageName					|
|All							|
|Flammables				|
|Firearms					|
|Food							|
|Household Tools	|
|Medical					|
|Sharp Objects		|
|Sporting Camping	|
|Miscellaneous		|
