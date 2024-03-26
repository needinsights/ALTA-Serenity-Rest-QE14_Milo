@Tugas
Feature: Create user
  Create user with json
Scenario Outline: Post create user with valid json
Given Create user with valid json "CreateUser.json"
When Send request create new User
Then Status code should be 201
And Response body name should be "<Name>" and "<Job>"
Examples:
| Name      | Job  |
| MILO      | CTO  |

