package Movieapptest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import pages.HomePageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
public class HomePage {
    public WebDriver driver;
    public WebDriverWait wait;
    HomePageFactory homePageFactory;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
       // WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10L));
        homePageFactory = new HomePageFactory(driver);
        homePageFactory.loginToApplication();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
    }
//    @Test(priority = 1)
//    public void loginApplication(){
//        homePageFactory.loginToApplication();
//    }

    @Test(priority = 2)
    public void headText(){
       // homePageFactory.deathProof();
        boolean value = homePageFactory.deathProof();
        Assert.assertTrue(value,"true");
    }
    @Test(priority = 3)
    public void checkMovLi(){
        boolean value1 = homePageFactory.checkMoviesList();
        Assert.assertTrue(value1,"true");
    }
    @Test(priority = 4)
    public void checkOrginalList(){
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
        boolean value2 = homePageFactory.checkOrginal();
        Assert.assertTrue(value2,"true");
    }

    @Test(priority = 5)
    public void visiblePlayBtn(){
       boolean playBtn = homePageFactory.checkPlayBtn();
        Assert.assertTrue(playBtn,"true");
    }
    @Test(priority = 6)
    public void moviesSectionChecking(){
        homePageFactory.checkMoviesSection();
      // boolean moviesList = homePageFactory.checkMoviesSection();
     //  Assert.assertEquals(moviesList,"true");
    }
    @Test(priority = 7)
    public void testTheContactSection(){
        boolean contactSection = homePageFactory.contactUs();
        Assert.assertTrue(contactSection,"true");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
