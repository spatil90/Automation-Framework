package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/testcases",
		glue = "step_def",
		tags = {"@dynamicloading"},
		dryRun= true,
		monochrome = true		
		)
public class Runner {

}
