@SmokeTest @Registration
Feature: User Registration

  Background:
    Given Navigate to Magento website

  Scenario: Register a new Account
    When Click on the Create an Account button
    Then Fill the registration information
    And Click on the submit registration button
    And User should see the success message