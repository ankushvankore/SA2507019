Feature: Google Title

  Scenario: To validate title of Google page
    Given Open Google
    When Read the title of page
    Then Title should be Google
