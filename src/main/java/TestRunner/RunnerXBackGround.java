package TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="FeaturesXBackGround",
        glue={"StepDefinitionsXBackGround"}


        )
public class RunnerXBackGround { }



///   @SmokeTest @RegressionTest @OddTest  @EvenTest