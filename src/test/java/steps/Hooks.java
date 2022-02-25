package steps;

import driver.DriverManager;
import driver.DriverMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
