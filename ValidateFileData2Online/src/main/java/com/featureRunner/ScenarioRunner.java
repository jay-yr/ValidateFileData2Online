package com.featureRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		features="FeatureFiles", 
		glue="com.stepDefinitions",
		plugin={"pretty", "html:Reports/Cucumber-html-report"},
		monochrome=true
		)
public class ScenarioRunner {

	
}
