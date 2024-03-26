  #Delete User Scenario 1
  Feature: Delete USer
  @Tugas
  Scenario Outline: Delete user with valid user id
  Given Delete user with valid user id <id>
  When Send request delete user
  Then Status code should be 204
  Examples:
  | id |
  | 5  |
  | 6  |
  | 7  |