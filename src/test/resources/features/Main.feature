Feature: Test feature

  @Test
  Scenario: First scenario
    Given I open Google
    When I go to the lucky page
    Then I see the Google logo

  @Test @Search
  Scenario: Search
    Given I open Google
    When I search for ELTE IK
    Then I see the Google logo