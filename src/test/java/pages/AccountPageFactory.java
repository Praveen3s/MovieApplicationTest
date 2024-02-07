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
public class AccountPageFactory {
    public WebDriver driver;
    public WebDriverWait wait;
    @FindBy(how = How.ID,using = "usernameInput")
    WebElement usernameEle;
    @FindBy(how = How.ID,using = "passwordInput")
    WebElement passwordEle;
    @FindBy(how = How.CLASS_NAME,using= "login-button")
    WebElement loginbuttonEle;

    public AccountPageFactory (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        PageFactory.initElements(driver, this);

    }
    public void testAccountPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        WebElement accountPage = driver.findElement(By.className("avatar-button"));
        accountPage.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement accountHeading = driver.findElement(By.className("account-heading"));
        wait.until(ExpectedConditions.visibilityOf(accountHeading));

        WebElement membershipContainer = driver.findElement(By.className("membership-container"));
        wait.until(ExpectedConditions.visibilityOf(membershipContainer));

        WebElement planContainer  = driver.findElement(By.className("plan-container"));
        wait.until(ExpectedConditions.visibilityOf(planContainer));

        WebElement  logoutButton  = driver.findElement(By.className("logout-button"));
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));

        WebElement iconsContainer =  driver.findElement(By.className("footer-icons-container"));
        wait.until(ExpectedConditions.visibilityOf(iconsContainer));

        WebElement contactUsPara = driver.findElement(By.className("contact-us-paragraph"));
        wait.until(ExpectedConditions.visibilityOf(contactUsPara));

    }

    public void loginToApplication(){
        usernameEle.sendKeys("rahul");
        passwordEle.sendKeys("rahul@2021");
        loginbuttonEle.click();
    }









}
