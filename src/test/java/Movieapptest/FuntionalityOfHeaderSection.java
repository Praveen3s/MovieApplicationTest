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
import pages.FunctionalityOfHeadSecPageFactory;


public class FuntionalityOfHeaderSection {
    public WebDriver driver;
    FunctionalityOfHeadSecPageFactory functionalityOfHeadSecPageFactory;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        //WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10L));
        functionalityOfHeadSecPageFactory = new FunctionalityOfHeadSecPageFactory(driver);
        functionalityOfHeadSecPageFactory.loginToApplication();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000));
    }
    @Test(priority = 1)
    public void checkTheHomeLink(){
      // functionalityOfHeadSecPageFactory.loginToApplication();
        functionalityOfHeadSecPageFactory.clickOnHomeLi();
      boolean homeBtn =  functionalityOfHeadSecPageFactory.clickOnHomeLi();
     Assert.assertTrue(homeBtn,"home container is not displayed");
    }
    @Test(priority = 2)
    public void checkThePopularBtn(){
        functionalityOfHeadSecPageFactory.clickOnPopular();
        boolean popularBtn = functionalityOfHeadSecPageFactory.clickOnPopular();
        Assert.assertTrue(popularBtn,"popular container is Displayed");
    }
    @Test(priority = 3)
    public void testAccountPage(){
        functionalityOfHeadSecPageFactory.checkAccountPage();
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
