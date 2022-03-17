package TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="FeaturesTagsHooks",
        glue={"StepDefinitionsTagsHooks"}

        // Step 1 Umcomment just below line ,tags ={"@OddTest"}  /// runs 1, 3,5 message
        //,tags ={"@OddTest"}

        // Step 2  Umcomment just below line   Logically  ORing Tags  Tags that are comma-separated are ORed. 1,2, 4,6
        //,tags ={"@SmokeTest , @EvenTest"}

        // Step 3 Umcomment just below line ,Logicallin And   Runs just Test 2
        // ,tags ={"@SmokeTest" ,"@EvenTest"}

        // Step 4 Umcomment just below line , Ignore Cucumber Tests  Print other than 2,4,6 means print 1,3,5
         ,tags ={"~@EvenTest"}

        )
public class RunnerTagsHooks { }



///   @SmokeTest @RegressionTest @OddTest  @EvenTest