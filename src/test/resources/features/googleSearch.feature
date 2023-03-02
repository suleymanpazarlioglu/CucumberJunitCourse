Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google





  Scenario: Google Search Functionality Title Verification
    Given user is on Google search page
    When  User types "apple" in the google search box and clicks enter
    Then  User sees "apple" is in the google title








