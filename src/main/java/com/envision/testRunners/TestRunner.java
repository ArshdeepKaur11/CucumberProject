package com.envision.testRunners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features"}, glue = {"com.envision.stepDefs"})
public class TestRunner {

}
