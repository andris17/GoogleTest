package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverManager;
import driver.DriverMethods;

import java.io.IOException;

public class Hooks {

    @Before
    public void beforeScenario() {
        DriverManager.deleteAllCookies();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                DriverMethods.addScreenshotToScenario(scenario, DriverMethods.takeScreenShot());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
