Feature: Order feature
  AS a user I should be able to fill the Order page


@smartBear
  Scenario Outline: User fill the Order form
    Given User is logged into SmartBear Tester account and on Order page
    And User fills out the form as followed from the table below:
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customer name>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>" to zip
    And User selects "<cardType>" as card type
    And User enters "<cardNumber>" to card number
    And User enters "<expiration date>" to expiration date
    And User clicks process button
    Then User verifies "<costumer name" is in the list

    Examples:
      | product     | quantity | costumer name  | street      | city        | state | zip   | cardType | cardNumber   | expiration date |
      | MyMoney     | 1        | Ken Adams      | Kinzie St   | Chicago     | IL    | 60004 | Visa     | 321654987123 | 12/22           |
      | FamilyAlbum | 4        | Joey Tribbiani | State St    | Chicago     | IL    | 60065 | Visa     | 524163987158 | 11/22           |
      | ScreenSaver | 5        | Rachel Green   | Michigan St | Chicago     | IL    | 60648 | Visa     | 741852963159 | 10/22           |
      | ScreenSaver | 10       | Monica Geller  | Euclid Ave  | Arl Hgts    | IL    | 60312 | Visa     | 654123875321 | 10/22           |
      | MyMoney     | 3        | Ross Geller    | River Rd    | Des Plaines | IL    | 60066 | Visa     | 321321654789 | 10/22           |
      | MyMoney     | 1        | Ken Adams      | Kenzie St   | Chicago     | IL    | 60045 | Visa     | 987789546213 | 12/22           |

