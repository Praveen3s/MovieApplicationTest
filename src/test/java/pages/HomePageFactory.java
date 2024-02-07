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
public class HomePageFactory {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(how = How.ID,using = "usernameInput")
    WebElement usernameEle;
    @FindBy(how = How.ID,using = "passwordInput")
    WebElement passwordEle;
    @FindBy(how = How.CLASS_NAME,using= "login-button")
    WebElement loginbuttonEle;
    @FindBy(how = How.CLASS_NAME,using = "home-movie-heading")
    WebElement headDeathProofEle;
    @FindBy(how = How.CLASS_NAME,using = "movies-list-heading")
    WebElement movieslistEle;
    @FindBy(how = How.XPATH,using = "//h1[text()='Originals']")
    WebElement OrigmovieslistEle;
    @FindBy(how = How.CLASS_NAME, using = "home-movie-play-button")
    WebElement playBtnele;
    @FindBy(how = How.XPATH,using = "html/body/div/div/div[2]/div[1]/div//a")
    List<WebElement> trensectionEle;
    @FindBy(how = How.XPATH,using = "html/body/div/div/div[2]/div[2]/div//a")
    List<WebElement> originalsecEle;
    @FindBy(how = How.CLASS_NAME,using = "contact-us-paragraph")
    WebElement contactSectionEle;

    public HomePageFactory (WebDriver driver){
       this.driver = driver;
       this.wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void headingDeath(){
        headDeathProofEle.isDisplayed();
    }
    public void moviesList(){
        movieslistEle.isDisplayed();
    }
    public void originalMovList(){
        OrigmovieslistEle.isDisplayed();
    }
    public boolean checkPlayBtn(){
     return   playBtnele.isDisplayed();
    }
    public boolean contactUs(){
       return contactSectionEle.isDisplayed();
    }




//    public void checkTheHeadingText(){
//        headDeathProofEle.isDisplayed();
//        movieslistEle.isDisplayed();
//        OrigmovieslistEle.isDisplayed();
//    }
    public boolean deathProof(){
       return  headDeathProofEle.isDisplayed();
    }
    public boolean checkMoviesList(){
        return movieslistEle.isDisplayed();
    }
    public boolean checkOrginal(){
      return  OrigmovieslistEle.isDisplayed();
    }
    public boolean checkMoviesSection(){
        return trensectionEle.size()>0 && originalsecEle.size()>0;
    }

    public void loginToApplication(){
        usernameEle.sendKeys("rahul");
        passwordEle.sendKeys("rahul@2021");
        loginbuttonEle.click();
    }



}
