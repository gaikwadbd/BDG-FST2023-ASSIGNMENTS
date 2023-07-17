Feature: Search for a Movie
  Scenario: The user can search for a movie
    Given Click on search bar
    When Add movie name to be searched
    Then Movie with similar name appears in the list
