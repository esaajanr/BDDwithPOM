package qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Selenium\\Selenium_Workspace\\BDDwithPOM\\src\\main\\java\\qa\\features\\fb_login.feature" //the path of the feature files
		,glue={"qa\\stepDefinition"}, //the path of the step definition files)
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // generate different types of outputs
		monochrome = true, // Display output in readable format
		strict = true, // check if any step is not defined in stepDefinition file
		dryRun = false // to check if mapping is proper in between feature file and step definition file
		//tags = {"~@SmokeTest" , "@RegressionTest"}
		)

public class TestRunner {

}
