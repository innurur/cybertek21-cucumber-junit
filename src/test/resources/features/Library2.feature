Feature: Login feature
  As a user, I should be able to login to the library app.

  @library2
  Scenario: Verify both Students and librarians  login
    Given The user login as a "<role>"
    Then The user on  "<page>"
      | role       | page      |
      | student    | Books     |
      | librarian# | Dashboard |

