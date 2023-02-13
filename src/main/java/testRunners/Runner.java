package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

@CucumberOptions(
        features={"src/test/java/Features"},
        glue={"StepDefinitions","util"},
        tags="",
        plugin = {
            "summary","pretty","html:Reports/CucumberReport/Reports.html"
        }
)
 class Runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();

}
