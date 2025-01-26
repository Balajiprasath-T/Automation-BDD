package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features/form.feature",
	    glue = {"stepDefinitions"},
	    plugin = {"pretty", "html:target/FormSubmission-reports"},
	    monochrome = true
	)
public class FormRunner extends AbstractTestNGCucumberTests {

}
