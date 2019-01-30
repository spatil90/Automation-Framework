package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/testcases",
		glue = "step_def",
		tags = {},
		dryRun= false,
		monochrome = true
		
		)
public class Runner {

}
