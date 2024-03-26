Feature: Register User
#tambahkan seknario untuk positive case dan negative case
#tambahkan annotation @Tugas
  @Tugas
  Scenario Outline: Post Register with valid data
    Given Register user with valid json "RegisterValid.json"
    When Send request post register user
    Then Status code should be 200
    And Response body name should be <id>
    And Validate json schema "RegisterValidSchema.json"
    Examples:
      | id |
      | 4  |

#Negative
#Register-Unsuccessful
  @Tugas
  Scenario Outline: Post Register with invalid data
    Given Register user with valid json "<JSON>"
    When Send request post login user
    Then Status code should be 400
    Examples:
    |         JSON          |
    | RegisterInvalid1.json |
    | RegisterInvalid2.json |
    | RegisterInvalid3.json |