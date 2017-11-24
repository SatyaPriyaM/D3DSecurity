@Case1
Feature: RegisterNewUser

  Background:
    Given I go to Url "https://www.d3dsecurity.co.uk"

  Scenario: RegisterNewUser
    When I click on Register button on home page
    Given I entered Email as "TestSP7@yahoo.com"
    And I entered New password as "Winter17"
    And I entered Confirm password as "Winter17"
    When I click on Register button
    Then I should see Home page with My Account tab
    And I should see Logout tab next to My Account tab


@Case2

Scenario: RegisterBlankEmailID

 When I click on Register button on home page
 Given I entered Email as <