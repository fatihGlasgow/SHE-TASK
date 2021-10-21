package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.Select;
import pages.AirEmissionsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.util.List;

public class AirEmissionsPageStepDefinitions {
    AirEmissionsPage airEmissionsPage = new AirEmissionsPage();
    String idFirstRecord;
   WebElement managerecordToDelete;

    @When("User clicks New_Record_button on the Air_Emissions page")
    public void user_clicks_new_record_button_on_the_air_emissions_page() {
        airEmissionsPage.newRecord.click();
    }
    @When("User clicks Manage_Record of the First Record on the Air_Emissions page")
    public void user_clicks_manage_record_of_the_first_record_on_the_air_emissions_page() {
        //go to the last page of Records
        airEmissionsPage.lastPageTo.click();
        ReusableMethods.waitForPageToLoad(5);
        idFirstRecord=airEmissionsPage.topManageRecord.getAttribute("data-id");
        managerecordToDelete=Driver.getDriver().findElement(By.id("manageRecord"+idFirstRecord));
        managerecordToDelete.click();

        System.out.println(airEmissionsPage.topManageRecord.getAttribute("href"));
}



    @When("User selects and clicks the delete button")
    public void user_selects_and_clicks_the_delete_button() {
        Driver.getDriver().findElement(By.id("cogDelete"+idFirstRecord)).click();
        ReusableMethods.waitForClickablility(airEmissionsPage.confirmToDelete,5);
        airEmissionsPage.confirmToDelete.click();
    }

    @Then("User verifies the First Record has been deleted")
    public void user_verifies_the_first_record_has_been_deleted() {
        System.out.println(airEmissionsPage.topManageRecord.getAttribute("data-id"));
        Assert.assertNotEquals(airEmissionsPage.topManageRecord.getAttribute("data-id"),idFirstRecord);

    }

    @Then("User clicks Log_out button")
    public void user_clicks_log_out_button() {
        airEmissionsPage.userDropDown.click();
        airEmissionsPage.logOutButton.click();

    }


}