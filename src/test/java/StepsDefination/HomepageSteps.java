package StepsDefination;

import Hooks.Hooks;
import MyPages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.time.Duration;

import static Hooks.Hooks.browser;

public class HomepageSteps  {
    Homepage myhomepage = new Homepage(browser);


    @Given("user navigated in home page")
    public void VerifyusernavigatedtoHomePage(){
        Assert.assertEquals(browser.getCurrentUrl(), "https://www.demoblaze.com/");
    }
    @When("user click on phones Category")
    public void Verifyuserclickonphonecategory(){
myhomepage.click_on_category(0);
    }
    @Then("products shoud be filtered with phone only")
    public void verifytheproductsisfilteredbyphones() {

//        Assert.assertEquals(myhomepage.check(),true);
    }




    @When("user click on laptops Category")
    public void Verifyuserclickonlaptopscategory(){

    }
    @Then("products shoud be filtered with laptop only")
    public void verifytheproductsisfilteredbylaptops(){

    }


    @When("user click on monitors Category")
    public void Verifyuserclickonmonitorscategory(){

    }
    @Then("products shoud be filtered with monitors only")
    public void verifytheproductsisfilteredbymonitors(){

    }

}
