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
import org.openqa.selenium.support.PageFactory;
public class LoginPageFactory {
    WebDriver driver;
    WebDriverWait wait;
//    @FindBy(id = "username")
//    WebElement userNameEle;
//    @FindBy(how = How.ID, using = "password" )
//    WebElement passwordEle;
    @FindBy(how = How.CLASS_NAME,using = "login-website-logo")
    WebElement logoEle;
    @FindBy(how = How.CLASS_NAME,using = "sign-in-heading")
    WebElement headingEle;
    @FindBy(how = How.XPATH,using = "//label[text()='USERNAME']")
    WebElement inputlabelEle;
    @FindBy(how = How.XPATH,using = "//label[text()='PASSWORD']")
    WebElement passwordlabelEle;
    @FindBy(how = How.CLASS_NAME,using = "login-button")
    WebElement loginbuttonEle;
    @FindBy(how = How.ID,using = "usernameInput")
    WebElement userinputEle;
    @FindBy(how = How.ID,using = "passwordInput")
    WebElement passinputEle;
    @FindBy(how = How.ID,using = "usernameInput")
    WebElement emptyuserEle;
    @FindBy(how = How.ID,using = "passwordInput")
WebElement passwordEle;
    @FindBy(how = How.ID, using ="usernameInput" )
    WebElement UsernameEle;
    @FindBy(how = How.ID,using = "passwordInput")
    WebElement emptypassEle;
    @FindBy(how = How.CLASS_NAME,using = "login-button")
    WebElement loginbtnEle;



    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void websiteLogo(){
        logoEle.isDisplayed();
    }
    public void headingTextLogin(){
        headingEle.getText();
    }
    public String inputLabel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='USERNAME']")));
       // Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("input-label")));
        return inputlabelEle.getText();
    }
    public String passLabel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='PASSWORD']")));
        return passwordlabelEle.getText();
    }
    public void loginButton(){
        loginbuttonEle.isDisplayed();
    }
    public void emptyUser(){
        userinputEle.sendKeys("");
    }
    public void emptyPass(){
        passinputEle.sendKeys("");
    }
    public void emptyuserName(){
        emptyuserEle.sendKeys("");
    }
    public void passWord(){
        passwordEle.sendKeys("rahul@2021");
    }
    public void userName(){
        UsernameEle.sendKeys("rahul");
    }
    public void emptyPassword(){
        emptypassEle.sendKeys("");
    }
    public void loginButtonClick(){
        loginbtnEle.click();
    }
    public void loginWithInvalidCredentials(){
        UsernameEle.sendKeys("rahul");
        passwordEle.sendKeys("rahul2021");
    }





public void checkTheApplication(){
    logoEle.isDisplayed();
    headingEle.getText();
}
    public String getText() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='USERNAME']")));
        return inputlabelEle.getText();
    }
    public String passwordLabel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='PASSWORD']")));
        return passwordlabelEle.getText();
    }
    public void loginBtn(){
        loginbuttonEle.isDisplayed();
    }
    public void checkEmptyInputFields(){
        userinputEle.sendKeys("");
        passinputEle.sendKeys("");
        loginbtnEle.click();
    }
    public void checkEmptyUserWithPassword(){
        emptyuserEle.sendKeys("");
        passwordEle.sendKeys("rahul@2021");
        loginbtnEle.click();
    }
    public void checkUsernameWithEmptyPassword(){
        UsernameEle.sendKeys("rahul");
        emptypassEle.sendKeys("");
        loginbtnEle.click();
    }
    public void checkLoginInvalid(){
        UsernameEle.sendKeys("rahul");
        passwordEle.sendKeys("rahul2021");
        loginbtnEle.click();
    }
    public void checkValidCredentials(){
        UsernameEle.sendKeys("rahul");
        passwordEle.sendKeys("rahul@2021");
        loginbtnEle.click();
    }
}








//    public void enterUserName(String username){
//        userNameEle.sendKeys(username);
//    }
//    public void enterPassword(String password){
//        passwordEle.sendKeys(password);
//    }
//    public void clickOnButton(){
//        submitButtonEle.click();
//    }
//public String  getErrorMessage(){
//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message")));
//    return errorMessageEle.getText();
//}


