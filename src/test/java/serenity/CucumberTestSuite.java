package serenity;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

		features = "src/test/resources/TSAGOVFeatures/TSAGOVContactRegression.feature",

		glue = { "TSAGOV.glue" }, dryRun = false, monochrome = true)

public class CucumberTestSuite {
}
