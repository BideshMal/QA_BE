package com.example.restservice.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingStepDefinitions {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String actualResponse;

    @When("the client requests a greeting")
    public void theClientRequestsAGreeting() {
        String url = "http://localhost:" + port + "/greeting";
        actualResponse = restTemplate.getForObject(url, String.class);
    }

    @Then("the response should contain \"Hello, World!\"")
    public void theResponseShouldContainHelloWorld() {
        assertThat(actualResponse).contains("Hello, World!");
    }

    @When("the client requests a greeting with the name {string}")
    public void theClientRequestsAGreetingWithName(String name) {
        String url = "http://localhost:" + port + "/greeting?name=" + name;
        actualResponse = restTemplate.getForObject(url, String.class);
    }

    @Then("the response should contain \"Hello, {string}!\"")
    public void theResponseShouldContainHelloName(String name) {
        assertThat(actualResponse).contains("Hello, " + name + "!");
    }
}

//package com.example.restservice.steps;
//
//import io.cucumber.java.en.Then;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class GreetingStepDefinitions {
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    private String actualResponse;
//
//    @Then("the response should contain a greeting message")
//    public void theResponseShouldContainAGreetingMessage() {
//        String url = "http://localhost:" + port + "/greeting";
//        actualResponse = restTemplate.getForObject(url, String.class);
//        assertThat(actualResponse).contains("Hello");
//    }
//}
