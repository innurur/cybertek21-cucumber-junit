Feature: Login feature
  As a user, I should be able to login to the library app.

  @login
  Scenario Outline: Verify both Students and librarians  login
    Given the user login as a "<role>"
    When user type "<email address>"
    And user type the "<password>"
    Then the user on  "<page>"

    Examples:
      | role      | email address       | password | page      |
      | student   | student19@library   | gc3mseeR | Books     |
      | student   | student20@library   | zwUwi5QL | Books     |
      | student   | student21@library   | j3q1Aw1v | Books     |
      | librarian | librarian14@library | 7gvTl7nE | Dashboard |


