package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\'MenusDashboard\']/li[2]/a")
	public WebElement employee;
	
	@FindBy(xpath = "//*[@id=\'MenusDashboard\']/li[2]/ul/li[1]/a")
	public WebElement create;
	
	@FindBy(xpath = "//*[@id=\'MenusDashboard\']/li[2]/ul/li[2]/a")
	public WebElement search;
	
	@FindBy(xpath = "//*[@id=\'MenusDashboard\']/li[3]")
	public WebElement more;
	
	@FindBy(xpath = "//*[@id=\'MenusDashboard\']/li[3]/ul/li[5]/a")
	public WebElement image;
	
	@FindBy(xpath = "//*[@id=\'MenusDashboard\']/li[3]/ul/li[6]/a")
	public WebElement slider;
	
	@FindBy(xpath = "//*[@id=\'MenusDashboard\']/li[3]/ul/li[7]/a")
	public WebElement tooltips;
	
	@FindBy(xpath = "//*[@id=\'MenusDashboard\']/li[3]/ul/li[1]/a")
	public WebElement multipleTabs;
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}