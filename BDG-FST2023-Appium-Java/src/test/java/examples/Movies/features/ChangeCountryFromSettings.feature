Feature: Change country from Settings
  Scenario: The user can change country from app settings
    Given Click on app settings
    Given Click on country settings
    When Select second country from the list
    Then Second country name is listed in Theatres Tab
