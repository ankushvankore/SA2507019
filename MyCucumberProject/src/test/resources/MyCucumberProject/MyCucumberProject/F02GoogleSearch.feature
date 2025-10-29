Feature: Google Search

  Scenario: To validate search functionality on Google
    Given Open Google In Chrome
    When Enter the keyword to search
    And Hit Enter
    Then A valid search result should display
