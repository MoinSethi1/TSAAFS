#Author: Moinpreet Sethi
Feature: Access TSA.gov

  Scenario Outline: As user I want to access TSA.gov application
    Given the user navigates to TSA.gov application
    Then user would see <sectionName> section on the page

    Examples: 
      | sectionName  | 
      | Header       |
      | Main Content |
      | Footer       |
