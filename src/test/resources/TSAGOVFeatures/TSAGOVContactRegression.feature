#Author:moinpreet.sethi
Feature: Contact section regression test

  Scenario Outline: As user I want to access all pages under Contact section
    Given user wants to access all pages on Contact section
    When user access Contact page <pageName>
    Then page <pageName> under Contact section is accessible

    Examples: 
      | pageName          |
      | Contact           |
      | Customer Service  |
      | Lost & Found      |
      | TSA PreCheck      |
      | Passenger Support |
      | Media             |
      | TWIC              |
      | Claims            |
      | Identification    |
      | HAZMAT            |
