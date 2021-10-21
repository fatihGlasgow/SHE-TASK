package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPageStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the application_login page with the LoginPage_URL")
    public void user_is_on_the_application_loginPage_with_the_LoginPage_URL() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginPage_URL"));
    }

    @When("User enters the UserName on the login page")
    public void user_enters_the_UserName_on_the_login_page() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("userName"), Keys.ENTER);

    }

    @And("User enters the UserPassword on the login page")
    public void user_enters_the_UserPassword_on_the_login_page() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("userPassword"));
    }
    @When("User clicks the Login_button on the login page")
    public void user_clicks_the_login_button_on_the_login_page() {
        loginPage.loginButton.click();
    }
}