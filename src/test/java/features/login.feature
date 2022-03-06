Feature: Login Test
  Scenario: login with valid email and password
    Given I am at Talenttek homepage
    And I enter valid email address
    And I enter valid password
    When I click on the Login button
    Then I should be able to successfully login