package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){

    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
         ReusableMethods.getScreenshot(scenario);
        //Driver.closeDriver();

    }
}
