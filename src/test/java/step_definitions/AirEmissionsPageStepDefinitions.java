package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.AirEmissionsPage;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.List;

public class AirEmissionsPageStepDefinitions {
    List<String> listdataid = new ArrayList<>();
    AirEmissionsPage airEmissionsPage = new AirEmissionsPage();
    WebElement managerecordToDelete;
    String dataidLast;
    String dataidToCompare;

    @When("User clicks New_Record_button on the Air_Emissions page")
    public void user_clicks_new_record_button_on_the_air_emissions_page() {
        airEmissionsPage.newRecord.click();

    }
    @When("User clicks Manage_Record of the First Record on the Air_Emissions page")
    public void user_clicks_manage_record_of_the_first_record_on_the_air_emissions_page() {
        airEmissionsPage.lastPageTo.click();
        //    ReusableMethods.waitForPageToLoad(3);
        try {
            managerecordToDelete = Driver.getDriver().findElement(By.id("manageRecord" + dataidLast));
            managerecordToDelete.click();
        } catch (Exception e) {
            e.printStackTrace();
            airEmissionsPage.prevPage.click();
            managerecordToDelete = Driver.getDriver().findElement(By.id("manageRecord" + dataidLast));
            managerecordToDelete.click();
        }
        //System.out.println("manageRecord" + dataidLast);
    }

    @When("User is on the AIR_Emissions Page")
    public void user_is_on_the_air_emissions_page() {
        airEmissionsPage.lastPageTo.click();
        //ReusableMethods.waitForPageToLoad(3);
        for (WebElement w : airEmissionsPage.listofManageRecords) {
            listdataid.add(w.getAttribute("data-id"));
        }
        dataidLast = listdataid.get(listdataid.size() - 1);
        //System.out.println(listdataid.get(listdataid.size() - 1));
        //System.out.println("manageRecord" + dataidLast);
    }
    @When("User selects and clicks the delete button")
    public void user_selects_and_clicks_the_delete_button() {
        Driver.getDriver().findElement(By.id("cogDelete" + dataidLast)).click();
        ReusableMethods.waitForClickablility(airEmissionsPage.confirmToDelete, 5);
        airEmissionsPage.confirmToDelete.click();
    }
    @Then("User verifies the First Record has been deleted")
    public void user_verifies_the_first_record_has_been_deleted() {
        //ReusableMethods.waitForVisibility(managerecordToDelete, 5);
        List<WebElement> listDataIdToCompare = new ArrayList<>();

        for (WebElement w : airEmissionsPage.listofManageRecords) {
            listDataIdToCompare.add(w);
        }
        dataidToCompare = listDataIdToCompare.get(listDataIdToCompare.size() - 1).getAttribute("data-id");
        //System.out.println(dataidToCompare);
        Assert.assertFalse("The first Record hasn't been Deleted", dataidLast == dataidToCompare);
       // Assert.assertTrue("The first Record hasn't been Deleted", dataidLast == dataidToCompare);
    }
    @Then("User clicks Log_out button")
    public void user_clicks_log_out_button() {
        airEmissionsPage.userDropDown.click();
        airEmissionsPage.logOutButton.click();
    }

}