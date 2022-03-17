package StepDefinitionsTagsHooks;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefinitionsTagsHooks {

    @Given("^User is printing message (\\d+)$")
    public void userIsPrintingMessage(int arg1) {
        System.out.println("Priting Messsage: " + arg1);
    }

   // Before and After Hooks Uncomment , mouse hover and click import class  like import cucumber.api.java.After;  &import cucumber.api.java.Before;
    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
