package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AirEmissionsCreatePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AirEmissionsCreatePageStepDefinitions {
    AirEmissionsCreatePage airEmissionsCreatePage = new AirEmissionsCreatePage();

    @When("User fills in the Sample_Date field with {string}")
    public void user_fills_in_the_sample_date_field_with(String date) {
        airEmissionsCreatePage.sampleDate.sendKeys(date);


    }

    @When("User fills in the Description field with {string}")
    public void user_fills_in_the_description_field_with(String description) {

        airEmissionsCreatePage.description.sendKeys(description);
    }

    @When("User clicks Save&Close_button")
    public void user_clicks_save_close_button() {
        airEmissionsCreatePage.saveClosebutton.click();
    }

}