package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Hooks {
    public static WebDriver browser;
    @Before(order = 1)
    public void setup(){
        browser = new ChromeDriver();
        browser.get("https://www.demoblaze.com/");
        browser.manage().window().maximize();
    }

    @After
    public void quit(){

        browser.quit();
    }
}
