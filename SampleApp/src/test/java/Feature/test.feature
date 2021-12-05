Feature: iPaintSample
Background:

  Given I start the application



  Scenario:All-in-One
    Given I check elements in the first page
    And I skip intro page
    Given I check elements in the second page
    And I skip intro page
    Given I check elements in the third page
    And I skip intro page
    Then I close ad with coordinates
    Then I check elements in the home page
    Then I click categories
    Then I close ad with right coordinates
    Then I check elements in categories page
    Then I swipe until category dogs is seen
    Then I click my works
    Then I close ad with right coordinates
    Given I check elements in my works
    Then I click others
    Then I close ad with right coordinates
    Given I check elements in others
    And I change language to Danish


