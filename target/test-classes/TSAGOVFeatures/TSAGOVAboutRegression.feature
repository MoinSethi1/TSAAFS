#Author:moinpreet.sethi
Feature: About section regression test

  Scenario Outline: As user I want to access all pages under About section
    Given user wants to access all pages on About section
    When user access About page
    Then page <pageName> under About section is accessible

    Examples: 
      | pageName         |
      | About            |
      | Strategy         |
      | Mission          |
      | Organization     |
      | Timeline         |
      | Employee Stories |
      | Jobs At TSA      |
      
