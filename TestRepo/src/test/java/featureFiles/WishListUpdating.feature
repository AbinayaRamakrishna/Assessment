@WishList @SmokeTest @Regression
Feature: Updating Products from the Wish List Functionality

  Background:
    Given Navigate to Magento website
    Then Click on the Sign In button
    And Enter the email and password then click the login button

  Scenario: Updating the Wish List

    Given Click on the Element in Dialog
      | customerMenu  |
      | myWishListBtn |

    Then Hover over on the Product and update the quantity to "3"

    And Click on the Element in Dialog
      | updateWishListBtn |

    Then Check if the quantity of selected product changed
