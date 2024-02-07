package Movieapptest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import pages.PapularPageFactory;
import pages.SearchPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SearchOperation {
    public  static WebDriver driver;
    SearchPageFactory searchPageFactory;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        searchPageFactory = new SearchPageFactory(driver);
    }

    @Test
    public void CheckSearchFunctionality(){
        searchPageFactory.LoginToApplication("rahul","rahul@2021");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        WebElement searchButton = driver.findElement(By.className("search-empty-button"));
        searchButton.click();

        WebElement searchButton1 = driver.findElement(By.className("search-button"));
        searchButton1.click();

        // We can search Movie and  pass the movie as an Argument below line , we can get the list of movies
        int value = searchPageFactory.searchFunctionalities("Avatar");
        if(value >=1){
            System.out.println("Search Functionality is Working Expected");
        }
    }
    @AfterMethod
    public void setdown() {
        driver.close();
    }
}

