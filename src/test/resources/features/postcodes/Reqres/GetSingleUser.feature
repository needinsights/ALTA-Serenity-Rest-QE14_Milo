Feature: Get single user
#tambahkan seknario untuk positive case dan negative case
#tambahkan annotation @Tugas
# POSITIVE
  @Tugas
  Scenario: Get single user with valid json
    Given Get single user with valid id 2
    When Send request get single user
    Then Status code should be 200

# NEGATIVE
  @Tugas
  Scenario: Get single user with invalid json
    Given Get single user with invalid id "a1"
    When Send request get single user
    Then Status code should be 404
