package TestMethods;			

import java.time.Duration;			
			
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;			
import org.openqa.selenium.support.ui.WebDriverWait;

import Objects.DashBoardPage;
import Objects.EmployeePage;
import Objects.ImagePage;
import Objects.LoginHomePage;
import Objects.MultipleTabsPage;
import Objects.SearchPage;
import Objects.SliderPage;
import Objects.TooltipsPage;
import io.github.bonigarcia.wdm.WebDriverManager;			
			
public class MainScript{			
			
	public static void main(String[] args) {		
		// TODO Auto-generated method stub	
			
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();	
			
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
		driver.manage().window().maximize();	
		driver.get("http://magnus.jalatechnologies.com/Account/Login");	
			
		LoginHomePage LoginHomePageObject = new LoginHomePage(driver);	
		LoginHomePageObject.userId.sendKeys("training@jalaacademy.com");	
		LoginHomePageObject.password.sendKeys("jobprogram");	
		LoginHomePageObject.signIn.click();	
			
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.urlContains("Index"));	
			
		String dashBoardPageTitle = driver.getTitle();	
			
		if(dashBoardPageTitle.equals("Magnus")) 	
		{	
			System.out.println("Log In Successful");
		}	
		else	
		{	
			System.out.println("Log In Failed");
		}	
		
		DashBoardPage DashBoardPageObject = new DashBoardPage(driver);	
		DashBoardPageObject.employee.click();	
		DashBoardPageObject.create.click();	
			
		EmployeePage EmployeeDetailsPageObject = new EmployeePage(driver);	
		EmployeeDetailsPageObject.firstName.sendKeys("Shilpa");	
		EmployeeDetailsPageObject.lastName.sendKeys("Goudar");	
		EmployeeDetailsPageObject.emailId.sendKeys("abcdefghi@gmail.com");	
		EmployeeDetailsPageObject.mobileNo.sendKeys("5648245972");	
		EmployeeDetailsPageObject.dateOfBirth.sendKeys("08/09/1983");	
		EmployeeDetailsPageObject.gender.click();	
		EmployeeDetailsPageObject.address.sendKeys("#52, vvjdsgug Nagar, 10th cross, 2nd main, Bangalore - 560072");	
			
		EmployeeDetailsPageObject.getCountrySelect().selectByVisibleText("India");
		EmployeeDetailsPageObject.getCitySelect().selectByValue("5");		
			
		EmployeeDetailsPageObject.skill1.click();	
		EmployeeDetailsPageObject.skill2.click();	
		EmployeeDetailsPageObject.save.click();	
		
		DashBoardPageObject.employee.click();
		DashBoardPageObject.search.click();
		SearchPage SearchPageObject = new SearchPage(driver);
		SearchPageObject.EmpName.sendKeys("Rakhi");
		SearchPageObject.SearchBtn.click();
		SearchPageObject.ClearBtn.click();
		SearchPageObject.EmpMobileNo.sendKeys("9344812233");
		SearchPageObject.SearchBtn.click();
		
		DashBoardPageObject.more.click();
		DashBoardPageObject.slider.click();
		SliderPage SliderPageObject = new SliderPage(driver);
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(SliderPageObject.sliderPointer, 579, 266).perform();
		
		DashBoardPageObject.image.click();
		ImagePage ImagePageObject = new ImagePage(driver);
		ImagePageObject.ChooseFile.sendKeys("D:\\Shilpa\\T-Shirt.jpg");
		ImagePageObject.upload.click();
		
		DashBoardPageObject.tooltips.click();
		TooltipsPage TooltipsPageObject = new TooltipsPage(driver);
		TooltipsPageObject.getTooltipBeforeClickOperation();
		TooltipsPageObject.tooltipButton.click();
		TooltipsPageObject.getTooltipAfterClickOperation();	
		
		DashBoardPageObject.multipleTabs.click();
		MultipleTabsPage MultipleTabsPageObject = new MultipleTabsPage(driver);
		MultipleTabsPageObject.PlanToSucceedTab.click();
		MultipleTabsPageObject.UnLearning.click();
		MultipleTabsPageObject.WaysOfUnlearning.click();

	}		
			
}			
		
