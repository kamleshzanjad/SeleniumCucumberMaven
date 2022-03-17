package StepDefinitionDDT;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Login_Test {
    public static WebDriver driver;
    String geckDriverPath = "/Users/kzanjad/Documents/Software/geckodriver";

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        System.out.println("Started test case. Inside method: user_is_on_Home_Page ");
        System.setProperty("webdriver.gecko.driver", geckDriverPath);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/v4");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        System.out.println("Started test case. Inside method: user_Navigate_to_LogIn_Page ");
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        driver.findElement(By.name("uid")).sendKeys("mngr391441");
        driver.findElement(By.name("password")).sendKeys("tAbAzej");
        driver.findElement(By.name("btnLogin")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws Throwable {
        driver.findElement(By.xpath("//a[text()='Log out']")).click();
    }

    @Then("^Message displayed LogOut Successfully$")
    public void message_displayed_LogOut_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
    }


    @And("^User enters both username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntersBothUsernameAndPassword(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside method enter2_the_Username_and_Password ");
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();
        // throw new PendingException();
    }

    @When("^User enters Credentials to LogIn$")
    public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
        //Write the code to handle Data Table
        List<List<String>> data = usercredentials.raw();

        driver.findElement(By.name("uid")).sendKeys(data.get(0).get(0));
        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
        driver.findElement(By.name("btnLogin")).click();

    }


    @And("^Login user enters credential details info$")
    public void loginUserEntersCredentialDetailsInfo(DataTable usercredentials) {
        for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
            driver.findElement(By.name("uid")).sendKeys(data.get("Username"));
            driver.findElement(By.name("password")).sendKeys(data.get("Password"));
        }
        driver.findElement(By.name("btnLogin")).click();
    }
}
