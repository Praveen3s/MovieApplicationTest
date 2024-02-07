package Movieapptest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import pages.AccountPageFactory;
import pages.SearchPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class AccountPage {
    public WebDriver driver;
    public WebDriverWait wait;
    AccountPageFactory accountPageFactory;


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        accountPageFactory = new AccountPageFactory(driver);
        accountPageFactory.loginToApplication();
    }
    @Test(priority = 1)
    public void checkAccountPage(){
        accountPageFactory.testAccountPage();
    }
@AfterMethod
    public void teardown (){
        driver.quit();
}

}
