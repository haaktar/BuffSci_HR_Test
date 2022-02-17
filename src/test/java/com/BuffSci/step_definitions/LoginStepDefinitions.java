package com.BuffSci.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("1");
    }
    @Given("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        System.out.println("1");
    }
    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String string) {
        System.out.println("1");
    }
}
