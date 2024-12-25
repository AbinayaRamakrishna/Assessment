@WishList @SmokeTest @Regression
Feature: Adding Products to the Wish List Functionality

  Background:
    Given Navigate to Magento website
    Then Click on the Sign In button
    And Enter the email and password then click the login button

  Scenario: Add Products to the Wish List
    Given Hover over on the Element
      | tableMen    |
      | subMenuTops |

    And Click on the Element in Dialog
      | subMenuJackets |

    Then Hover over on the Product and click Wish List button

    And Check if the number of products in the Wish List is correct

    Then Hover over on the Element
      | tableMen |

    And Click on the Element in Dialog
      | subMenuTops |

    Then Hover over on the Product and click Wish List button

    And Check if the number of products in the Wish List is correct

