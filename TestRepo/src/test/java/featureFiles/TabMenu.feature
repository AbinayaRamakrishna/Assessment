@SmokeTest @Regression @TabMenu
Feature: TAB Menu Functionality

  Background:
    Given Navigate to Magento website

  Scenario: Access the Main Categories From the TAB Menu
    When Click on the Sign In button
    And Enter the valid credentials in the placeholders provided

    And Click the Main categories in the TAB Menu
      | whatsNew |
      | women    |
      | men      |
      | gear     |
      | training |
      | sale     |

    Then User should be able to see the all main and sub categories


