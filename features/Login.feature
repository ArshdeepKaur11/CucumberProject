Feature: Login Feature

  Background:
    Given user launch the Chrome Browser
    Then user open the URL "https://demo.actitime.com/login.do"

  Scenario: login with valid credentials
    When user enter the user id "admin"
    And user enter the Password "manager"
    And user click Login
    Then user should see page title as "actiTIME - Enter Time-Track"
    And user click logout
    Then user see the page title as "actiTIME - Login"
    And user close the browser

  Scenario: login with invalid credentials
    When user enter the user id "admin12"
    And user enter the Password "manager12"
    And user click Login
    Then user should see error message as "Username or Password is invalid. Please try again."
    And user close the browser

