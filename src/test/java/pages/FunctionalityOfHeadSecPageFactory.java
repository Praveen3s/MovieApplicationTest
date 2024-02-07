package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.PageFactory;
public class FunctionalityOfHeadSecPageFactory {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(how = How.ID,using = "usernameInput")
    WebElement usernameEle;
    @FindBy(how = How.ID,using = "passwordInput")
    WebElement passwordEle;
    @FindBy(how = How.CLASS_NAME,using= "login-button")
    WebElement loginbuttonEle;
    @FindBy(how = How.XPATH,using ="//a[text()='Home']")
    WebElement homeLinkEle;
    @FindBy(how = How.CLASS_NAME,using = "home-bottom-container")
   WebElement homeBtnContEle;
//    @FindBy(how = How.XPATH,using = "//a[text()='Popular']")
//    WebElement
//@FindBy(how = How.CLASS_NAME,using = "search-movies-container")
//WebElement popularBtnContEle;


    public FunctionalityOfHeadSecPageFactory (WebDriver driver) {
      this.driver = driver;
       this.wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
}
    public boolean clickOnHomeLi() {
        By homeLinkBy = By.xpath("//a[text()='Home']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeLinkBy));
        driver.findElement(homeLinkBy).click();
        return homeBtnContEle.isDisplayed();
    }
    public boolean clickOnPopular(){
        By popularLinkBy = By.xpath("//a[text()='Popular']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(popularLinkBy));
        driver.findElement(popularLinkBy).click();
        WebElement popularBtnContEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("search-movies-container")));
        return popularBtnContEle.isDisplayed();
    }
    public void checkAccountPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement accountPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("avatar-button")));
        accountPage.click();
    }


    public void loginToApplication(){
        usernameEle.sendKeys("rahul");
        passwordEle.sendKeys("rahul@2021");
        loginbuttonEle.click();
    }


}
