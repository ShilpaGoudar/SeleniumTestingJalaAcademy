package Objects;
	
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.support.FindBy;		
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;		
		
public class EmployeePage {		
		
	@FindBy(id="FirstName")	
	public WebElement firstName;	
		
	@FindBy(id = "LastName")	
	public WebElement lastName;	
		
	@FindBy(id = "EmailId")	
	public WebElement emailId;	
		
	@FindBy(id = "MobileNo")	
	public WebElement mobileNo;	
		
	@FindBy(id="DOB")	
	public WebElement dateOfBirth;	
		
	@FindBy(xpath = "//*[@id=\'rdbFemale\']")	
	public WebElement gender;	
		
	@FindBy(name = "Address")	
	public WebElement address;	
	
	@FindBy(id = "CountryId")
	public WebElement Country;
	public Select getCountrySelect()
	{
		return new Select(Country);
	}
	
	@FindBy(id = "CityId")
	public WebElement City;
	public Select getCitySelect()
	{
		return new Select(City);
	}
		
	@FindBy(xpath = "//*[@id=\'chkSkill_1\']")	
	public WebElement skill1;	
	@FindBy(xpath = "//*[@id=\'chkSkill_6\']")	
	public WebElement skill2;	
		
	@FindBy(xpath = "//*[@id=\'frmEmployee\']/div[2]/button")	
	public WebElement save;	
		
	public EmployeePage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}	
		
}		
