Feature: Update Feature
#Positive
  @Tugas
  Scenario Outline: Update user with valid json and user id
    Given Update user with valid json "<json>" and user id <id>
    When Send request update user
    Then Status code should be 200
    And Response body page should be "<name>" and job is "<job>"

    Examples:
      | id |        json       |   name   |      job       |
      | 1  | UpdateTugas1.json | morpheus |  zion resident |

#Negative
  @Tugas
  Scenario Outline: Update user with invalid json and user id
    Given Update user with invalid json "<json>" and user id <id>
    When Send request update user
    Then Status code should be 400
    And Response body page should be "<name>" and job is "<job>"

    Examples:
      | id |        json              |  name   |      job       |
      | 1  | UpdateTugasInvalid1.json | masdiar |  zion resident |