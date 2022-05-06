package org.example.tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"classpath:features/triggers.feature"},
        glue = {"org.example.stepdefs"}, tags = "@all")
public class TestRunner {
}