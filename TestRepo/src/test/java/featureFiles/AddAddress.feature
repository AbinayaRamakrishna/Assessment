@SmokeTest @Regression @Address
Feature: Add Address Functionality

  Background:
    Given Navigate to Magento website
    Then Click on the Sign In button
    And Enter the email and password then click the login button

  Scenario Outline: Address Insertion Functions
    Given Click on the my Account
    And Click on the Address Book
    Then Add new Address as "<firstName>" as "<lastName>" as "<company>" as "<telephone>" as "<street_1>" as "<street_2>" as "<street_3>" as "<city>" as "<zip>"
    And The user should receive the message that the address has been successfully added
    Examples:
      | firstName | lastName | company        | telephone    | street_1      | street_2    | street_3   | city       | zip    |
      | Nithin    | Kumar    | Intell Comcast | 7383798891   | Vysal Street  | 2 Cross Cut | Varadhar   | Coimbatore | 641001 |
      | Harish    | James    | Intell Comcast | 8767890909   | Nehru Nagar   | Oppanakar   | brookebond | Coimbatore | 641016 |
      | Muthu     | Selva    | Intell Comcast | 6755778990   | Uppilipalayam | Kuppam      | Hamsha     | Coimbatore | 641029 |

