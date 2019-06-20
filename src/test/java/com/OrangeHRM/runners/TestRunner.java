package com.OrangeHRM.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ScottBrown\\eclipse-workspace\\OrangeHRMFramework\\src\\test\\resources\\Features\\GoogleSearch.feature"
, glue="com/OrangeHRM/steps")

public class TestRunner {

}

