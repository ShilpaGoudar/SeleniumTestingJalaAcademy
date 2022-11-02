package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	
	
	@FindBy(id="Name")
	public WebElement EmpName;
	
	@FindBy(id="MobileNo")
	public WebElement EmpMobileNo;
	
	@FindBy(id="btnSearch")
	public WebElement SearchBtn;
	
	@FindBy(xpath="//*[@id=\"tblEmployee\"]/tbody/tr[2]/td[9]/a[2]")
	public WebElement Delete;
	
	@FindBy(id="btnClear")
	public WebElement ClearBtn;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

}
