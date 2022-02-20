package com.BuffSci.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "com/BuffSci/step_definitions",                           //to show where step definitions are located
        dryRun = false,
        plugin = {
                "html:target/default-cucumber-reports",

        },
        tags = "@login"
)

public class CucumberRunners {
}
