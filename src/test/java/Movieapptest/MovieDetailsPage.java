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
import pages.MovieDetailsPageFactory;
import pages.SearchPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class MovieDetailsPage {
    public WebDriver driver;
    public WebDriverWait wait;
    MovieDetailsPageFactory movieDetailsPageFactory;


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        movieDetailsPageFactory = new MovieDetailsPageFactory(driver);
        movieDetailsPageFactory.loginToApplication();
    }
    @Test(priority = 1)
    public void checkHomePage(){
       // movieDetailsPageFactory.clickOnHome();
        boolean home = movieDetailsPageFactory.clickOnHome();
        Assert.assertTrue(home,"is not displayed as expected");
    }
@Test(priority = 2)
public void checkPopularPage(){
   // movieDetailsPageFactory.clickOnPopular();
    boolean popular =  movieDetailsPageFactory.clickOnPopular();
    Assert.assertTrue(popular,"is not displayed as expected");

}
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
