Feature: Travel section regression test

  Scenario Outline: As user I want to access all pages under Travel section
    Given user wants to access all pages on Travel section
    When user access Travel pages
    Then page <pageName> under Travel section is accessible

    Examples: 
      | pageName                        |
      | Travel                          |
      | Security Screening              |
      | What Can I Bring                |
      | Identification                  |
      | Liquids Rule                    |
      | Emerging Technology             |
      | REAL ID                         |
      | Special Procedures              |
      | Disabilities Medical Conditions |
      | Military                        |
      | Children                        |
      | Seniors                         |
      | Law Enforcement                 |
      | Cultural                        |
      | TSA PreCheck                    |
      | Airport Airlines                |
      | Schedule                        |
      | FAQ                             |
      | Trusted Traveler Programs       |
      | Passenger Support               |
      | Civil Rights                    |
      | Travel Redress                  |
      | Claims                          |
      | Travel Tips                     |
      | Travel Checklist                |
      | Travel FAQ                      |
