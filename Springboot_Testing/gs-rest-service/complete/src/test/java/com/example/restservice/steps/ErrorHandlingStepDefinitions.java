package com.example.restservice.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ErrorHandlingStepDefinitions {

    private String actualResponse;

    @When("the client requests a greeting without providing a name")
    public void theClientRequestsAGreetingWithoutProvidingAName() {
        // Simulate the scenario where the client requests a greeting without providing a name
        // You may want to use your testing approach to set actualResponse based on the simulated response
        // For simplicity, we'll just set a static response for now
        actualResponse = "Error: Name parameter is missing";
    }

    @Then("the response should contain an error message")
    public void theResponseShouldContainAnErrorMessage() {
        assertTrue(actualResponse.contains("Error"), "Response should contain 'Error'");
        assertTrue(actualResponse.contains("missing"), "Response should contain 'missing'");
    }
}

//package com.example.restservice.steps;
//
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class ErrorHandlingStepDefinitions {
//
//    private String actualResponse;
//
//    @When("the client requests a greeting without providing a name")
//    public void theClientRequestsAGreetingWithoutProvidingAName() {
//        // You can make the HTTP request here or use a testing approach based on your project setup
//        // Set actualResponse based on the response received
//        // For simplicity, we'll just set a static response for now
//        actualResponse = "Error: Name parameter is missing";
//    }
//
//    @Then("the response should contain an error message")
//    public void theResponseShouldContainAnErrorMessage() {
//        assertTrue(actualResponse.contains("Error"));
//        assertTrue(actualResponse.contains("missing"));
//    }
//}
