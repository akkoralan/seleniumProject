
 @login
Feature: Users should be able to login

  Background:
    Given the user is on the login page
  Scenario: Login as a driver
    When the user enter the driver information
    Then the user should be able to login

    Scenario: Login as a Sales Manager
      When  the user enter Sales Manager information
      Then the user should be able to login

      Scenario: Login as a store manager
        When the user enter store manager information
        Then the user should be able to login

