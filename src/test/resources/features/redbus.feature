Feature: redbus Login

  Scenario: Verify redbus dashboard
    Given I am on the redbus dashboard page
    Then I verify dashboard page


  Scenario: Search Rail Journey with valid Origin and Destination
    Given I am on the redbus dashboard page
    When Go to Rail Journey page
    When Enter a valid origin city
    When Enter a valid destination city
    When Click on calendar and select date on Rail Page
    Then Click on search button
    Then Verify search result
    Then Go back to Bus Journey page


  Scenario: Search Bus Journey with Valid Origin and Destination
    Given I am on the redbus dashboard page
    When Enter a valid origin city
    When Enter a valid destination city
    When Click on calendar and search


  Scenario: Visit to Signup to redbus Account page
    Given I am on the redbus dashboard page
    When Click on the Account link
    And Go to signup page
    Then Verify signup page


