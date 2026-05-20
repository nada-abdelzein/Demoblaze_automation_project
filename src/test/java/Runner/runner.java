package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/login.feature",
        glue = {"StepsDefination" , "Hooks"}
)
public class runner extends AbstractTestNGCucumberTests {

}
