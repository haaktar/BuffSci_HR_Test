package com.BuffSci.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class Driver {


    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            String browser = "chrome";

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    break;
                default:
                    throw new RuntimeException("Browser not implemented yet" + browser);
            }

        }

        return driver;
    }

}
