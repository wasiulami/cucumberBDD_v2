Feature: Signup Test

  @signupVerify
  Scenario Outline: : Sign in after creating a brand new test account
    Given I am at TalentTEK homepage
    And I create a brand new student account
    And I click on Login link
    When I login with brand new student credentials
    Then I should be able to successfully login
    Examples:
      |firstName|lastName|email              |password|month|day|year|gender|
      |wasiul   |two     |wasiultwo@gmail.com|123456  |3    |10 |1998|male  |