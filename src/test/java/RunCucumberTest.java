import io.cucumber.junit.CucumberOptions;


//@RunWith (Cucumber.class)
//@CucumberOptions(plugin = "pretty", features = "src/test/java/features")
@CucumberOptions(features = {
        "src/test/resources/features/Login.feature" }, glue = "com.example.CucumberJunitAllureReportDemo.definitions", plugin = {
        "pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" })
public class RunCucumberTest
{
}

