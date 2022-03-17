package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="FeaturesOptions",
        glue={"StepDefinitionOptions"},
        monochrome = true

        )
public class RunnerOptionsMonoChromeTrue
{

}