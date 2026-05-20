package MyPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Homepage {
    WebDriverWait mywait;
    WebDriver MyBrowser;
    public final By Categories = By.cssSelector("div.list-group>[id=\"itemc\"]");
    public  final By signupbtn = By.id("signin2");
    public final By loginbtn =  By.id("login2");
    public final By  cartbtn = By.id("cartur");
    public final By aboutbtn = By.cssSelector("[data-target=\"#videoModal\"]");
    public final By contactbtn = By.cssSelector("[data-target=\"#exampleModal\"]");
    public final By allphones = By.cssSelector("[class=\"col-lg-4 col-md-6 mb-4\"]");
    public final By allphones2 = By.cssSelector("[id=\"tbodyid\"]");
    public final By welcomemessage = By.id("nameofuser");

    public  Homepage(WebDriver browser){
        this.MyBrowser =  browser;
        mywait = new WebDriverWait(browser , Duration.ofSeconds(5));

    }
    public void click_on_category(int index){
        List<WebElement> allcategory = mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Categories));
        allcategory.get(index).click();
    }
    public void click_on_login(){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(loginbtn)).click();
    }
    public void click_on_signup(){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(signupbtn)).click();
    }
    public void click_on_cart(){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(cartbtn)).click();
    }
    public void click_on_about(){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(aboutbtn)).click();
    }
    public void click_on_contact(){
        mywait.until(ExpectedConditions.visibilityOfElementLocated(contactbtn)).click();
    }
    public int getallphonenumbers(){

        return mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allphones)).size();
    }
//    public boolean check(){
//       return mywait.until(ExpectedConditions.visibilityOf(MyBrowser.findElement(allphones2))).isDisplayed();
//    }

    public String getwelcomemeassage(){
        return mywait.until(ExpectedConditions.visibilityOfElementLocated(welcomemessage)).getText();
    }
}
