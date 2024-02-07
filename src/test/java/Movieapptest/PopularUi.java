package Movieapptest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PapularPageFactory;

public class PopularUi {
    public WebDriver driver;
    public WebDriverWait wait;

    PapularPageFactory popularPageFactory;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        popularPageFactory = new PapularPageFactory(driver);
        popularPageFactory.loginToApplication();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void popularClick() {
        boolean popular = popularPageFactory.checkThePopularBtn();
        Assert.assertTrue(popular, "Popular movies are not displayed");
    }
    @AfterMethod
    public void teardown(){
driver.quit();
    }
}
