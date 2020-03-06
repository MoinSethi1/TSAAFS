#Author:moinpreet.sethi
Feature: Search Functionality regression test

  Scenario Outline: As user I want to search on various pages
    Given user wants to perform search operation
    When user access the <searchPage> page
    And user searches on page <searchPage> for text <searchItem>, year <year>, month <month>, category <category>, Press Releases <pressReleases>, topic <topic>, day <day>, time <time>
    Then search result is displayed on page <searchPage> with expected text <expectedText>

    Examples: 
      | searchPage       | searchItem                              | year | month | category       | pressReleases       | topic    | day    | time      | expectedText                                                          |
      | What Can I Bring | Food                                    |      |       |                |                     |          |        |           | Food                                                                  |
      | Blog             | Creep-in                                | 2019 |       |                |                     |          |        |           | Creep-in                                                              |
      | Testimony        |                                         | 2019 | Sep   |                |                     |          |        |           | Statement of Patricia F. S. Cogswell                                  |
      | Speeches         |                                         | 2019 | Oct   |                |                     |          |        |           | TSA Acting Deputy Administrator Patricia Cogswell                     |
      | Employee Stories |                                         | 2019 | Dec   | Human interest |                     |          |        |           | What people are saying about TSA                                      |
      | FAQ              | Pat-down Screening                      |      |       |                |                     |          |        |           | pat-down screening                                                    |
      | TSA Pre FAQ      | TSA Pre                                 |      |       |                |                     |          |        |           | TSA Pre✓® for Military Members                                        |
      | Press Releases   |                                         | 2019 | Jul   |                | Local Press Release | Outreach |        |           | TSA to host hiring event for jobs at Burlington International Airport |
      | Travel Tips      | liquid                                  |      |       |                |                     |          |        |           | Refresh your memory on the liquid rules                               |
      | A-Z Index        | Civil Rights                            |      |       |                |                     |          |        |           | Civil Rights                                                          |
      | Schedule         | IAD                                     |      |       |                |                     |          | Monday | 1am - 2am | 1am - 2am                                                             |
      | Airport Airlines | Washington Dulles International Airport |      |       |                |                     |          |        |           | Washington Dulles International Airport (IAD)                         |
