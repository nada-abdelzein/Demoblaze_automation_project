package StepsDefination;

import Hooks.Hooks;
import MyPages.Homepage;
import MyPages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginsteps {
    Homepage myhomepage = new Homepage(Hooks.browser);
    LoginPage myloginpage;

    @Before(order = 2)
    public void checkbeforesenario(){
        myhomepage.click_on_login();
        myloginpage =  new LoginPage(Hooks.browser);
    }

    @Given("user navigated in login page")
    public void userNavigatedInLoginPage() {
        Assert.assertEquals(myloginpage.checklogintitleisdisplayed(), true);
    }

    @When("user enter valid username and valid password")
    public void userEnterValidUsernameAndValidPassword() {
    myloginpage.sendusername("fady123");
    myloginpage.sendpassword("123");
    myloginpage.click_on_login();
    }


    @Then("Welcome message apper to user in home page")
    public void welcomeMessageApperToUserInHomePage() {
    Assert.assertEquals(myhomepage.getwelcomemeassage(),"Welcome fady123");
    }

//    @When("user enter invalid username and invalid password")
//    public void userEnterInvalidUsernameAndInvalidPassword() {
//        myloginpage.sendusername("fady12");
//        myloginpage.sendpassword("12");
//        myloginpage.click_on_login();
//    }

    @Then("Error message apper and say wrong username and wrong password")
    public void errorMessageApperAndSayWrongUsernameAndWrongPassword() {
Assert.assertEquals(myloginpage.getalertmessage(), "username or password is wrong");
    }

    @When("user enter valid {string} and valid {string}")
    public void userEnterValidAndValid(String username, String password) {
        myloginpage.sendusername(username);
        myloginpage.sendpassword(password);
        myloginpage.click_on_login();
    }
}
