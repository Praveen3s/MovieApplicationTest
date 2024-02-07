package Movieapptest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HeadSectionPageFactory;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HeadSection {
    public static WebDriver driver;
    public HeadSectionPageFactory headSectionPageFactory ;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        headSectionPageFactory=new HeadSectionPageFactory(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



    @Test(priority = 1)
    public void checkTheLogoElement(){
        headSectionPageFactory.enterUsername("rahul");
        headSectionPageFactory.enterPassword("rahul@2021");
        headSectionPageFactory.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        Assert.assertTrue(headSectionPageFactory.isLogoElementLocated() ,"Logo Element Not Found");
    }

    @Test(priority=2)
    public void checkTheNavBars() {
        headSectionPageFactory.enterUsername("rahul");
        headSectionPageFactory.enterPassword("rahul@2021");
        headSectionPageFactory.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        Assert.assertTrue(headSectionPageFactory.isHomeNavbarDisplayed() , "Home Page NavBar is Not Working As Expected" );
        Assert.assertTrue(headSectionPageFactory.isPopularNavBarDisplayed(), "Popular Page NavBar is Not Working As Expected" );
        Assert.assertTrue(headSectionPageFactory.isAccountNavBarDisplayed() , "Account Page NavBar is Not Working As Expected" );

    }


}

