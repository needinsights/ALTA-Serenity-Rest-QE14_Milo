Feature: Login

# Positive
@Tugas
  Scenario: Post login user with valid email and password
    Given Login user with valid json "LoginWithValidCredentials.json"
    When Send request post login user
    Then Status code should be 200
    And Validate json schema "LoginUserSuccessfulSchema.json"

 # Negative
 @Tugas
  Scenario Outline: Post login user with invalid email and password
    Given Login user with invalid json "<JSON>"
    When Send request post login user
    Then Status code should be 400
   Examples:
   |                JSON                  |
   |  LoginWithInvalidCredentials.json    |
   |  LoginWithInvalidCredentials2.json   |
   |  LoginWithInvalidCredentials3.json   |