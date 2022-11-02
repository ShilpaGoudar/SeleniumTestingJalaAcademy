package Objects;	

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.support.FindBy;		
import org.openqa.selenium.support.PageFactory;		
		
public class LoginHomePage {		
		
	@FindBy(id = "UserName")	
	public WebElement userId;	
		
	@FindBy(id="Password")	
	public WebElement password;	
		
	@FindBy(id="btnLogin")	
	public WebElement signIn;	
		
	public LoginHomePage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}	
}		
