package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "StepDefinition", dryRun = true)

public class SmokeRunner {
}

//if we wanna run certain feature we have to use @ in .feature class above scenario
//tags option will execute the tagged testcase as mentioned in your runner class