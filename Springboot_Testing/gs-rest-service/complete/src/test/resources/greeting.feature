Feature: Greeting Service

  Scenario: Default Greeting
    When the client requests a greeting
    Then the response should contain "Hello, World!"

  Scenario: Customized Greeting
    Given a user with the name "John"
    When the client requests a greeting
    Then the response should contain "Hello, John!"

  Scenario: Missing Name Parameter
    When the client requests a greeting without providing a name
    Then the response should contain "Hello, World!"

  Scenario: Invalid Name Parameter
    Given an invalid name parameter "?@#$%^&*"
    When the client requests a greeting
    Then the response should contain "Hello, World!"
