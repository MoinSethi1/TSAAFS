#Author:moinpreet.sethi
Feature: Media section regression test

  Scenario Outline: As user I want to access all pages under Media section
    Given user wants to access all pages on Media section
    When user access Media page <pageName> 
    Then page <pageName> under Media section is accessible

    Examples: 
      | pageName       |
      | Media          |
      | Media Room     |
      | Press Releases |
      | Testimony      |
      | Speeches       |
      | Statements     |
      | Factsheets     |
      | Social Media   |
      | Blog           |
      | Videos         |
