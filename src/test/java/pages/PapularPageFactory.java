package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
public class PapularPageFactory {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(how = How.ID, using = "usernameInput")
    WebElement usernameEle;
    @FindBy(how = How.ID, using = "passwordInput")
    WebElement passwordEle;
    @FindBy(how = How.CLASS_NAME, using= "login-button")
    WebElement loginbuttonEle;
    @FindBy(how = How.CSS, using = ".nav-link.active-nav-link")
    WebElement popularEle;


    public PapularPageFactory(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }
    public boolean checkThePopularBtn(){
//        By popularLinkBy = By.xpath("//a[text()='Popular']");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(popularLinkBy));
//        driver.findElement(popularLinkBy).click();
//        WebElement popularBtnContEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("search-movies-container")));
//        return popularBtnContEle.isDisplayed();
        By popularLinkBy = By.cssSelector(".nav-link.active-nav-link");
        wait.until(ExpectedConditions.visibilityOfElementLocated(popularLinkBy));
        driver.findElement(popularLinkBy).click();

        return popularEle.isDisplayed();
    }



    public void loginToApplication(){
        usernameEle.sendKeys("rahul");
        passwordEle.sendKeys("rahul@2021");
        loginbuttonEle.click();
    }


}
