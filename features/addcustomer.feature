Feature: Add Customer Feature

  Background:
    Given user launch the Chrome Browser
    Then user open the URL "https://demo.actitime.com/login.do"

  Scenario: add new customer
    When user enter the user id "admin"
    And user enter the Password "manager"
    And user click Login
    Then user should see page title as "actiTIME - Enter Time-Track"
    And user click the TaskTab
    Then user click add new
    And user click add new customer
    Then user enter new customer as "EnvisionCustomer"
    And user enter new customer description as "EnvisionStudent"
    Then user click create new
    And user validate the added customer
    Then user click logout
    And user close the browser