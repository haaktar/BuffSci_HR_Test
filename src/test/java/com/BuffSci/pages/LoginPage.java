package com.BuffSci.pages;

import com.BuffSci.utilities.ConfigurationReader;
import com.BuffSci.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class LoginPage {
    @FindBy(id = "input-13")
    private WebElement emailElement;

    @FindBy(id = "input-16")
    private WebElement passwordElement;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login() {

        String email = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        emailElement.sendKeys(email);
        passwordElement.sendKeys(password);


    }
}
