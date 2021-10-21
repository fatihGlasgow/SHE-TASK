package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import utilities.Driver;

public class AirEmissionsPage {
    public AirEmissionsPage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath ="//*[text()=' New Record ']")
    public WebElement newRecord;
    @FindBy(xpath = "//a[text()='Last']")
    public WebElement lastPageTo;
    @FindBy(xpath = "(//*[@class='list_layout StatusBars clearfix ui-selectee blocked'])['FINAL00 first description should not be seen']")
    public WebElement topManageRecord;
    @FindBy(xpath = "//*[@*='Fatih Karakoc']")
    public WebElement userDropDown;
    @FindBy(xpath = "//*[text()='Confirm']")
    public WebElement confirmToDelete;
    @FindBy(xpath ="//*[text()='Log Out']" )
    public WebElement logOutButton;
}
