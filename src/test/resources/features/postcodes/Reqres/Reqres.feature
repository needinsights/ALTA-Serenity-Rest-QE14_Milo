Feature: Serenity Rest QE 14
  Scenario: Get list users with valid parameter page
    Given get list user with parameter page 2
    When Send request get list users
    Then Status code shouldbe 200+