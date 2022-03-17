package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="FeaturesOptions",
        glue={"StepDefinitionOptions"},
        format = {"pretty"}
)
public class RunnerOptionsFormatPretty
{

}