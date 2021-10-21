package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(linkText = "Modules")
    public WebElement modulesDropDown;
    @FindBy(xpath = "//*[text()='Environment']")
    public WebElement Environment;
    @FindBy(xpath = "//*[text()='Air Emissions']")
    public WebElement Air_Environment;

}
