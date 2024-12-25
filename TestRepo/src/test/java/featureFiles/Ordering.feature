@SmokeTest @Ordering
Feature: Product Purchase and Payment Process

  Background:
    Given Navigate to Magento website

  Scenario: Product Purchase and Payment
    When Click on the Sign In button
    And Enter the valid credentials in the placeholders provided
    When Hover over the tab menu categories
      | women     |
      | womenTops |
    And Click on the element in content
      | hoodiesWm |
    And Click on the element in content
      | hoodie1 |
    And Add the product to the cart by selecting size and color.
    And Click on the element in content
      | addToCartBtn |
    And View the shopping cart and update the quantifies or remove a product if necessary
    And Click on the element in content
      | proceedToCheckoutBtn |
    And Select the default address or enter a new one
    And Click on the element in content
      | radioBtn |
    And Click on the element in content
      | nextBtn |
    And Check if the billing address matches the shipping address
    And Click on the element in content
      | placeOrderBtn |
    Then User should be able to see the confirmation message and the order number on the success page



