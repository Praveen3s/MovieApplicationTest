Feature: Login Functionality

  As a user of the E-commerce application
  I want to be able login into my account
  So that I can access personalized features make purchases

  Scenario: Successful Login
    Given I am on login page
    When I enter Valid username and password
    And I click on the login button
    Then I should be redirected to the home page

