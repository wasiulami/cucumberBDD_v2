Feature: Login Test

  Background: Login Test
    Given I am at TalentTEK homepage



  Scenario: Login with valid email and password
    And I enter valid email address
    And I enter valid password
    When I click on Login button
    Then I should be able to successfully login

  Scenario: Login with invalid email and valid password
    And I enter invalid email address
    And I enter valid password
    When I click on Login button
    Then I should not be able to successfully login

  Scenario Outline: Login with different sets of dynamic data
    And I enter valid "<email>" address
    And I enter valid "<password>"
    When I click on Login button
    Then I should be able to successfully login

    Examples:
      |email     |password|
      |fakeEmail1|pass1   |
      |fakeEmail2|pass2   |

#
#  @hb
#  Scenario Outline: Login with different sets of hard-coded data
#    And I enter student valid "<email>" address
#    And I enter student valid "<password>"
#    When I click on Login button
#    Then I should be able to successfully login
#
#    Examples:
#      |email|password|
#      |qaenv@gmail.com|Te$t1234|
#      |qaenv2@gmail.com|Te$t1234|
#
#
#  Scenario: Login with valid email and invalid password
#    And I enter valid email address
#    And I enter invalid password
#    When I click on Login button
#    Then I should be able to successfully login
#
#  Scenario: Login with invalid email and valid password
#    And I enter invalid email address
#    And I enter valid password
#    When I click on Login button
#    Then I should be able to successfully login
#
#  Scenario: Login with invalid email and password
#    And I enter invalid email address
#    And I enter invalid password
#    When I click on Login button
#    Then I should be able to successfully login