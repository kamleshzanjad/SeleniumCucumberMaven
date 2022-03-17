package TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="FeaturesTaggedHooks",
        glue={"StepDefinitionsTaggedHooks"}



        )
public class RunnerTaggedHooks { }



///   @SmokeTest @RegressionTest @OddTest  @EvenTest