package stepdefinations;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginFunctionalitysteps {
     WebDriver driver;
     @Before
    public void setup(){
         WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.manage().window().maximize();
     }
     @Given("I am on login page")
    public void iAmOnTheLoginPage (){
         driver.get("https://rahulnxttrendz.ccbp.tech/login");
     }
    @When("I enter Valid username and password")
    public void iEnterValidUsernameAndPassword() {
        // Implement code to enter valid username and password
        driver.findElement(By.id("username")).sendKeys("rahul");
        driver.findElement(By.id("password")).sendKeys("rahul@2021");
    }
    @And("I click on the login button")
    public void iClickOnTheLoginButton(){
         driver.findElement(By.className("login-button")).click();
    }


    @Then("I should be redirected to the home page")
    public void iShouldBeRedirectedtoTheHomePage() {
        // Implement code to verify redirection to the home page
        String expectedUrl = "https://rahulnxttrendz.ccbp.tech/";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl, "Url do not match");
    }

    @After
    public void teardown(){
         driver.quit();
        }

}
