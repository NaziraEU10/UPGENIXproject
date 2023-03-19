Feature: Login feature
  As a user, I should be able
  to log in so that I can land on homepage.

@PosManager
  Scenario: Login as a PosManager
    Given I am on the login page
    When I enter username "posmanager10@info.com"
    And I enter password "posmanager"
    And Click the login button
    Then User should be able to validate page title
  Then User should be able to logout from the "POSManager10" account



  @SalesManager
  Scenario: Login as a SalesManager
     Given I am on the login page
     When I enter username  "salesmanager16@info.com"
     And I enter password "salesmanager"
     Then User should be able to validate page title
    Then User should be able to logout from the "SalesManager16" account


  Scenario Outline: Login as a SalesManager and PostManager
    Given User should be able to navigate to webpage
    When User should be able to enter username "<ManagerType>"
    And User should be able to enter password "<Password>"
    And Click the login button
    Then User should be able to validate page title
    Then User should be able to logout from the "<Username>" account
    Examples:
    |ManagerType            |Password    |Username|
    |salesmanager16@info.com|salesmanager|SalesManager16|
    |posmanager10@info.com  |posmanager  |POSManager10  |