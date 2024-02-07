package Movieapptest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import pages.LoginPageFactory;

public class LoginPage {
    public WebDriver driver;
    LoginPageFactory loginPageFactory;

    public LoginPage() {
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qamoviesapp.ccbp.tech");
        loginPageFactory =new LoginPageFactory(driver);
    }
    @Test(priority = 1)
    public void checkToApplication(){
        loginPageFactory.checkTheApplication();
    }

    @Test(priority = 2)
    public void usernameLabel() {
        loginPageFactory.inputLabel();

        String usernamelabelText = loginPageFactory.inputLabel();
        Assert.assertEquals(usernamelabelText, "USERNAME", "LABELTEXT IS NOT EXPECTED");

    }
    @Test(priority = 3)
    public void passwordLabelTest(){
        loginPageFactory.passLabel();
        String passwordlabelText =  loginPageFactory.passLabel();
        Assert.assertEquals(passwordlabelText, "PASSWORD", "LABELTEXT IS NOT EXPECTED");

    }
    @Test(priority = 4)
    public void loginbtnVisible(){
        loginPageFactory.loginButton();
    }
    @Test(priority = 5)
    public void emptyFields(){
        loginPageFactory.checkEmptyInputFields();
    }
    @Test(priority = 6)
    public void emptyUserNamefeild(){
        loginPageFactory.checkEmptyUserWithPassword();
    }
    @Test(priority = 7)
    public void emptyPassfeild(){
        loginPageFactory.checkUsernameWithEmptyPassword();
    }
    @Test(priority = 8)
            public void invalidCredentials(){
        loginPageFactory.checkLoginInvalid();
    }
    @Test(priority = 9)
    public void validCredentials(){
        loginPageFactory.checkValidCredentials();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}


//    @Test(priority = 2)
//    public void testthepasswordtext() {
//
//        WebElement passwordEl = driver.findElement(By.xpath("//label[text()='PASSWORD']"));
//        String passwordlabeltext = passwordEl.getText();
//        Assert.assertEquals(passwordlabeltext, "PASSWORD", "PASSWOR Label Text Is not Expected");
//    }
//
//    @Test(priority = 3)
//    public void testtheloginbutton() {
//        WebElement loginbuttonEl = driver.findElement(By.className("login-button"));
//        Assert.assertNotNull(loginbuttonEl, "Login button not present");
//    }
//
//    @Test(priority = 4)
//    public void testloginfuntionality() {
//        driver.findElement(By.id("usernameInput"));
//        driver.findElement(By.id("passwordInput"));
//    }
//
//    @Test(priority = 5)
//    public void emptyusename() {
//        driver.findElement(By.id("usernameInput")).sendKeys("");
//        driver.findElement(By.id("passwordInput")).sendKeys("rahul@2021");
//        driver.findElement(By.className("login-button")).click();
//    }
//
//    @Test(priority = 6)
//    public void emptypassword() {
//        driver.findElement(By.id("usernameInput")).sendKeys("rahul");
//        driver.findElement(By.id("passwordInput")).sendKeys("");
//        driver.findElement(By.className("login-button")).click();
//    }
//
//    @Test(priority = 7)
//    public void invalidcredentials() {
//        driver.findElement(By.id("usernameInput")).sendKeys("rahul");
//        driver.findElement(By.id("passwordInput")).sendKeys("rahul2021");
//        driver.findElement(By.className("login-button")).click();
//    }
//
//    @Test(priority = 8)
//    public void validcredentials() {
//        driver.findElement(By.id("usernameInput")).sendKeys("rahul");
//        driver.findElement(By.id("passwordInput")).sendKeys("rahul@2021");
//        driver.findElement(By.className("login-button")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement playbuttonEl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("home-movie-play-button")));
//        Assert.assertTrue(playbuttonEl.isDisplayed(), "play button is not displayed");
//    }
//
//    @AfterMethod
//    public void teardown() {
//        driver.quit();
//    }
//}








