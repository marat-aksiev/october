Feature: Search function at Amazon website
  User Story: User should be able to search for a product at Amazon and get expected response.

  @wip
  Scenario: Search for an insurance
    Given user is one the USAA main page
    When users clicks search button
    And user prints "insurance" in the search box
    And user clicks search submit button
    And user clicks on the link
    Then user is on the needed page