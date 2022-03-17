package StepDefinition.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Steps1 {

    WebDriver driver;
    String geckDriverPath="/Users/kzanjad/Documents/Software/geckodriver";

    @Given("^Open the Firefox and launch the application1$")
    public void open_the_Firefox_and_launch_the_application1() throws Throwable
    {
        System.out.println("Started test case. Insdie method: open_the_Firefox_and_launch_the_application1 ");
        System.setProperty("webdriver.gecko.driver", geckDriverPath);
        driver= new FirefoxDriver();
//        System.setProperty("webdriver.chrome.driver", "/Users/kzanjad/Documents/Software/chromedriver");
//
//        // Create driver object for CHROME browser, set implicit wait
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/v4");
    }

    @When("^Enter the Username and Password1$")
    public void enter_the_Username_and_Password1() throws Throwable
    {
        System.out.println("Inside method enter_the_Username_and_Password1 ");
        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
        //Thread.sleep(2000);
    }

    @Then("^Reset the credential1$")
    public void Reset_the_credential1() throws Throwable
    {
        System.out.println("Inside method Reset_the_credential1 ");
        driver.findElement(By.name("btnReset")).click();
        //Thread.sleep(2000);
        driver.quit();
    }
}