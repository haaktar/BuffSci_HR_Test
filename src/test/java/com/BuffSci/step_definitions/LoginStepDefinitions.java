package com.BuffSci.step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    WebDriver driver;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("3");
    }

    @Given("User logs in with username  and password")
    public void user_logs_in_with_username_and_password() {

    }

    @Then("Main Page page should be displayed")
    public void main_page_page_should_be_displayed() {


    }


}
