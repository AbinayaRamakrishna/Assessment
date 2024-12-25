@SmokeTest @Login
Feature: Login Functionality

  Background:
    Given Navigate to Magento website
    Then Click on the Sign In button

  Scenario: Login Functionality with valid information
    Given Enter the valid email and password then click the login button

  Scenario: Login Functionality with invalid/null information
    When Enter the null email and password then click the login button
    And Enter the invalid email and password then click the login button
    And Enter the email and null password then click the login button
    Then Enter the email and invalid password then click the login button

  Scenario: Forgot your password
    Given Click on the Forgot your password









