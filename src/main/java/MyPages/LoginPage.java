package MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver browser;
    WebDriverWait mywait;
    public final By username =  By.id("loginusername");
    public final By password = By.id("loginpassword");
    public final By loginbtn = By.cssSelector("[onclick=\"logIn()\"]");
    public final By canclebtn = By.xpath("(//button[text() = \"Close\"])[3]");
    public final By logintitle =  By.id("logInModalLabel");


    public LoginPage(WebDriver browser){
        this.browser = browser;
        mywait = new WebDriverWait(browser, Duration.ofSeconds(6));
    }
    public void sendusername (String Enteredusername){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(username));
        browser.findElement(username).sendKeys(Enteredusername);
    }
    public void sendpassword (String Enteredpassword){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(password));
        browser.findElement(password).sendKeys(Enteredpassword);
    }
    public void click_on_login(){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(loginbtn));
        browser.findElement(loginbtn).click();
    }
    public void click_on_close(){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(canclebtn));
        browser.findElement(canclebtn).click();
    }
    public boolean checklogintitleisdisplayed(){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(logintitle));
        return browser.findElement(logintitle).isDisplayed();
    }
    public String getalertmessage(){
        return mywait.until(ExpectedConditions.alertIsPresent()).getText();
    }
}
