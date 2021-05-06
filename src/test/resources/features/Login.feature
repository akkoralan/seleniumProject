@wip
Feature: Users should be able to login

  Scenario: Login as a driver
    Given the user is on the login page
    When the user enter the driver information
    Then the user should be able to login

    Scenario: Login as a Sales Manager
      Given the user is on the login page
      When  the user enter Sales Manager information
      Then the user should be able to login

      Scenario: Login as a store manager
        Given the user is on the login page
        When the user enter store manager information
        Then the user should be able to login