@SmokeTest @SearchFunction
Feature: Search Functionality

  Background:
    Given Navigate to Magento website
    Then Click on the Sign In button
    And Enter the email and password then click the login button

  Scenario: Search Product by Product Code
    Given Hover over on the Element
      | tableMen    |
      | subMenuTops |

    And Click on the Element
      | subMenuJackets |
    And Select Product and Search by Code
    Then The user must be able to see the product
    And Incorrect Product Code "MJ154611"