package com.BuffSci.step_definitions;

import com.BuffSci.pages.LoginPage;
import com.BuffSci.utilities.ConfigurationReader;
import com.BuffSci.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User is on login page")
    public void user_is_on_login_page() {

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @Given("User logs in with username  and password")
    public void user_logs_in_with_username_and_password() {

        loginPage.login();

    }

    @Then("Main Page page should be displayed")
    public void main_page_page_should_be_displayed() {


    }


}
