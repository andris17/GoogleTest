Feature: Test feature

  @Test @Lucky
  Scenario: First scenario
    Given I open Google
    When I go to the lucky page
    Then I see the Google logo
    When I select the first suggestion when searching for ELTE IK

  @Test @Search
  Scenario: Search
    Given I open Google
    When I search for ELTE IK
    Then I see the Google logo

  @Test @Search
  Scenario: Search suggested option
    Given I open Google
    When I select the first suggestion when searching for ELTE IK
    Then I see the Google logo