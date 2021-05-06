
@navigate
  Feature: Navigation Menu Scenarios

    Scenario: Navigation Fleet --Vehicles
      Given the user is on the login page
      And the user enter Sales Manager information
      When the user navigate to Fleet, Vehicles
      Then the title should be vehicles
   @db
      Scenario: Navigating Marketing --Campaigns
        Given the user is on the login page
        And the user enter Sales Manager information
        When the user navigates Marketing, Campaigns
        Then the title should be Campaigns

        Scenario: Navigating Activities --Calender Events
          Given the user is on the login page
          And the user enter Sales Manager information
          When the user navigates Activities, Calendar Events
          Then the title should be Calendars
