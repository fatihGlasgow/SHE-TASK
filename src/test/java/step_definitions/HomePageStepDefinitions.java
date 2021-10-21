package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.ReusableMethods;

public class HomePageStepDefinitions {
    HomePage homePage = new HomePage();

    @When("User clicks the Modules_button on the Home page")
    public void user_clicks_the_modules_button_on_the_home_page() {
        homePage.modulesDropDown.click();
        ReusableMethods.waitForClickablility(homePage.modulesDropDown,10);
    }

    @And("User hovers over the Environment")
    public void user_hovers_over_the_environment() {
        ReusableMethods.hover(homePage.Environment);
        ReusableMethods.waitForVisibility(homePage.Environment,10);
    }

    @And("User hovers over and clicks the Air_Emissions")
    public void user_hovers_over_and_clicks_the_air_emissions() {
        ReusableMethods.hover(homePage.Air_Environment);
        ReusableMethods.waitForVisibility(homePage.Air_Environment,10);
        homePage.Air_Environment.click();


    }

}