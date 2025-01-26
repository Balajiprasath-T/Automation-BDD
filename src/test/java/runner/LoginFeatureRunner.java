package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features/Login.feature",
	    glue = {"stepDefinitions"},
	    plugin = {"pretty", "html:target/LoginFeaturecucumber-reports"},
	    monochrome = true
	)
public class LoginFeatureRunner extends AbstractTestNGCucumberTests{

}
