#Author:moinpreet.sethi
Feature: Search Functionality regression test

  Scenario Outline: As user I want to search on various pages
    Given user wants to perform search operation
    When user access <searchPage> page
    And user searches for <searchItem>
    Then search result is displayed

    Examples: 
      | searchPage       | searchItem |
      | What Can I Bring | Food       |
