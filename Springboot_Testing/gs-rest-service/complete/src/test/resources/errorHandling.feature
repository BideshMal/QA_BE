Feature: Error Handling

  Scenario: Missing Name Parameter
    When the client requests a greeting without providing a name
    Then the response should contain an error message

  Scenario: Invalid Name Parameter
    Given an invalid name parameter "?@#$%^&*"
    When the client requests a greeting
    Then the response should contain an error message
