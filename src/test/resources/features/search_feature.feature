Feature: Search function at Amazon website
  User Story: User should be able to search for a product at Amazon and get expected response.

  @wip
  Scenario Outline: Search for a product
    Given user is one the Amazon main page
    When user prints "product_name" in the search box
    And users clicks search button
    Then user sees the result with "product_name"
    Examples:
      | product_name |
      | selenium     |
      #| pen          |
      #| picture      |