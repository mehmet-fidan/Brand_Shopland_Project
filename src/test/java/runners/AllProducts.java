package runners;

import hooks.Hooks;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/featureClass/AllProduct.feature"},
        glue = {"stepDefinitions"},
        plugin = { "pretty", "json:target/cucumber-reports/cucumber.json"},
        monochrome = true


)

public class AllProducts extends AbstractTestNGCucumberTests {
   /* {

        Hooks.fileName = "runner.xlsx";
        Hooks.path = "runner.xlsx";
    }

    */
}
