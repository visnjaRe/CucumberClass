Feature: Login Functionalities

  Scenario: Valid admin login
    Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login btn
    Then user is logged in successfully
