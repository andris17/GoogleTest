package runners;

import driver.DriverManager;
import enums.BrowserType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.Log4jUtils;

@CucumberOptions(
        tags = "@Lucky",
        features = {"src/test/resources/features/"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber/html-report/cucumber-report.html", "json:target/cucumber.json"})
@RunWith(Cucumber.class)
public class DefaultGoogleTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting test suite...");
        System.setProperty("log4j.configurationFile", "src\\main\\resources\\log4j2.properties.xml");

        DriverManager.setCloseBrowsers(false);

        DriverManager.initDriver(BrowserType.CHROME);

        if (System.getProperty("logLevel") != null) {
            Log4jUtils.setRootLevel(System.getProperty("logLevel"));
        }

        if (System.getProperty("classLogLevel") != null && System.getProperty("classLogName") != null) {
            Log4jUtils.setLevel(System.getProperty("classLogName"), System.getProperty("classLogLevel"));
        }

        DriverManager.setImplicitWaitTimeout(2);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite is finished, browser will be closed.");

        DriverManager.destroyDriver();
    }
}