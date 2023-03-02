Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table

    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

  @wip
  Scenario Outline: User should be able to place order and order seen in web table

    Given user is already logged in and on order page
    When user selects product type "<product>"
    And user enters quantity <quantity>
    And user enters customer name "<name>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    Examples:
      | product    | quantity | name                  | street            | city       | state   | zipcode | cardType | cardNumber       | expDate | expectedName          |
      | Familybea  | 2        | Sherlock Holmes       | 221B Baker Street | London     | England | 50505   | visa     | 1111222233334444 | 12/23   | Sherlock Holmes       |
      | MoneyCog   | 2        | Bill Gates            | 221B Baker Street | Manchester | England | 50505   | visa     | 1111222233334444 | 10/23   | Bill Gates            |
      | Screenable | 4        | CV Raman              | London st         | London     | England | 50505   | Visa     | 1111222233334444 | 12/24   | CV Raman              |
      | MoneyCog   | 5        | Galileo               | London st         | London     | England | 50505   | Visa     | 1111222233334444 | 12/24   | Galileo               |
      | MoneyCog   | 6        | Isaac Newton          | London st         | London     | England | 50505   | Visa     | 1111222233334444 | 12/24   | Isaac Newton          |

