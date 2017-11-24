@Signin
Feature: Signin

  @login
  Scenario: Checking Login Feature
    Given I entered URL "https://www.d3dsecurity.co.uk"
    When I click on Login button on the Home Screen
    Given I entered Username/Email as "sanya1993@yahoo.com"
    And I entered Password as "winter"
    When I click on Login button
    Then I should see MyAccount button on the Home Page
    And I should see Logout button on the Home Page
# Update to track
    @login_invalid
    Scenario: Checking Invalid Login Credentials
    Given I entered URL "https://www.d3dsecurity.co.uk"
    When I click on Login button on the Home Screen
    Given I entered Username/Email as "san1993@yahoo.com"
    And I entered Password as "winter"
    When I click on Login button
#    Then I should see Page Title "Login"
    And I should see error message "Wrong credentials"
# Comment for SourceTree