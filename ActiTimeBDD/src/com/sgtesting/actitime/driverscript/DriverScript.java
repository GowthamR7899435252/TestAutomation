package com.sgtesting.actitime.driverscript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles/",
		glue = {"com.sgtesting.actitime.stepdefinitions"}	
		)
public class DriverScript {

}
