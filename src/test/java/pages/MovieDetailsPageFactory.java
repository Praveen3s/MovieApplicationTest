package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import java.util.*;
public class MovieDetailsPageFactory {
    public WebDriver driver;
    public WebDriverWait wait;
    @FindBy(how = How.ID,using = "usernameInput")
    WebElement usernameEle;
    @FindBy(how = How.ID,using = "passwordInput")
    WebElement passwordEle;
    @FindBy(how = How.CLASS_NAME,using= "login-button")
    WebElement loginbuttonEle;

    public MovieDetailsPageFactory (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        PageFactory.initElements(driver, this);

    }
    public boolean clickOnHome(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
        WebElement homeBtnClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Home']")));
               // driver.findElement(By.xpath("//a[text()='Home']"));
        homeBtnClick.click();
        WebElement movSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='The Suicide Squad']")));
               // driver.findElement(By.xpath("//img[@alt='The Suicide Squad']"));
        movSection.click();

        WebElement reviewSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-review-container")));
        return reviewSection.isDisplayed();
    }
    public boolean clickOnPopular(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
        WebElement popularBtnClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Popular']")));

        popularBtnClick.click();
        WebElement popularMovSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='The Amazing Spider-Man']")));

        popularMovSection.click();

        WebElement popReviewSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-details-container")));
        return popReviewSection.isDisplayed();
    }

    public void loginToApplication(){
        usernameEle.sendKeys("rahul");
        passwordEle.sendKeys("rahul@2021");
        loginbuttonEle.click();
    }
}
