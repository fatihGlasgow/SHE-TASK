package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AirEmissionsCreatePage {
    public AirEmissionsCreatePage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(id = "SheAirEmissions_Description")
    public WebElement description;
    @FindBy(id="SheAirEmissions_SampleDate")
    public  WebElement sampleDate;
    @FindBy(xpath = "//*[text()='Save & Close']")
    public WebElement saveClosebutton;


}
