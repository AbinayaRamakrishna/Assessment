@WishList @SmokeTest @Regression
Feature: Removing Products from the Wish List Functionality

  Background:
    Given Navigate to Magento website
    Then Click on the Sign In button
    And Enter the email and password then click the login button

  Scenario: Removing Products from the Wish List
    Given Click on the Element in Dialog
      | customerMenu  |
      | myWishListBtn |
    Then Hover over on the Product and click remove from list button
    And Check if the item removed message displayed
    And Check if the number of products in the Wish List is correct
