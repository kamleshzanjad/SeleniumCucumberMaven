package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class Steps2_DataDriven {

    WebDriver driver;

    String geckDriverPath="/Users/kzanjad/Documents/Software/geckodriver";

    @Given("^Open2 the Firefox and launch the application$")
    public void open2_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.out.println("Started test case. Inside method: open2_the_Firefox_and_launch_the_application ");
        System.setProperty("webdriver.gecko.driver", geckDriverPath);
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/v4");
    }

    //@When("^Enter2 the Username \"(.*)\" and Password \"(.*)\"$")
    @When("^Enter the UserId <username> and Password <password>$")
    //@When("^Enter(\\d+) the Username User(\\d+)and Password password(\\d+)$")
    public void enter2_the_Username_and_Password(String username,String password) throws Throwable
    {    System.out.println("Inside method enter2_the_Username_and_Password ");
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        //Thread.sleep(2000);
    }

    @Then("^Reset2 the credential$")
    public void	Reset2_the_credential() throws Throwable
    {
        System.out.println("Inside method Reset2_the_credential ");
        driver.findElement(By.name("btnReset")).click();
        // Thread.sleep(2000);
        driver.quit();
    }


}


