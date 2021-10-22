package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import utilities.Driver;

import java.util.List;

public class AirEmissionsPage {
    public AirEmissionsPage(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath ="//*[text()=' New Record ']")
    public WebElement newRecord;
    @FindBy(xpath = "//a[text()='Last']")
    public WebElement lastPageTo;
    @FindBy(xpath = "//*[@class='list_layout StatusBars clearfix ui-selectee blocked']")
    public List<WebElement> listofManageRecords;
    @FindBy(xpath = "//*[@*='Fatih Karakoc']")
    public WebElement userDropDown;
    @FindBy(xpath = "//*[text()='Confirm']")
    public WebElement confirmToDelete;
    @FindBy(xpath ="//*[text()='Log Out']" )
    public WebElement logOutButton;
    @FindBy(xpath = "//*[@class=\"page-prev\"]")
    public WebElement prevPage;
}
