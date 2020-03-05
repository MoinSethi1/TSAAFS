#Author:moinpreet.sethi
Feature: Search Functionality regression test

  Scenario Outline: As user I want to search on various pages
    Given user wants to perform search operation
    When user access <searchPage> page
    And user searches on page <searchPage> for text <searchItem>, year <year>, month <month>, category <category>
    Then search result is displayed on page <searchPage> for text <searchItem>, year <year>, month <month>

    Examples: 
      | searchPage       | searchItem                                        | year | month | category       |
      | What Can I Bring | Food                                              |      |       |                |
      | Blog             | Creep-in                                          | 2019 |       |                |
      | Testimony        | Statement of Patricia F. S. Cogswell              | 2019 | Sep   |                |
      | Speeches         | TSA Acting Deputy Administrator Patricia Cogswell | 2019 | Oct   |                |
      | Employee Stories | What people are saying about TSA                  | 2019 | Dec   | Human interest |
      | FAQ              | pat-down screening                                |      |       |                |
