Feature: Account types
  @wip @smoke
  Scenario: Driver user
    Given the user loged in as "driver"
    When the user navigates "Activities" "Calendar Events"
    Then the title contain "Calendar Events - Activities"
  @wip @smoke
  Scenario: Sales manager user
    Given the user loged in as "sales manager"
    When the user navigates "Customers" "Accounts"
    Then the title contain "Accounts - Customersxxx"
  @wip
  Scenario: Store manager user
    Given the user loged in as "store manager"
    When the user navigates "Customers" "Contacts"
    Then the title contain "Contacts - Customerszzz"


  Scenario Outline: Login with different accounts <userType>
    Given the user loged in as "<userType>"
    When the user navigates "<tab>" "<module>"
    Then the title contain "<Title>"
    Examples:
      | userType      | tab        | module          | Title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts - Customers         |


  Scenario Outline: Login with different users
    Given the user loged in as "<userType>"
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |
