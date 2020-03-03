Feature: Footer Regression

  Scenario Outline: As user I want to access all links in the footer
    Given the user navigates to the application
    Then link <linkName> in the footer section shall be accessible

    Examples: 
      | linkName                 |
      | A to Z Index             |
      | DHS                      |
      | Employee                 |
      | FOIA                     |
      | Federal Relay            |
      | Industry                 |
      | Metrics                  |
      | No FEAR                  |
      | Privacy                  |
      | Report Fraud Waste Abuse |
      | USA.gov                  |
      | Subscribe                |
