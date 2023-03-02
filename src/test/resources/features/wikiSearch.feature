Feature: Wikipedia search functionality and verification

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When  User types "Steve Jobs" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "Steve Jobs" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "Steve Jobs" is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When  User types "Steve Jobs" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "Steve Jobs" is in the image header

   @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "<searchValue>" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "<expectedTitle>" is in the wiki title
    Then  User sees "<expectedHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedHeader    |
      | Steve Jobs        | Steve Jobs        | Steve Jobs        |
      | Bill Gates        | Bill Gates        | Bill Gates        |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo |
      | Chuck Norris      | Chuck Norris      | Chuck Norris      |
      | Lady Gaga         | Lady Gaga         | Lady Gaga         |
