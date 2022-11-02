package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TooltipsPage {
	
	@FindBy(xpath="//*[@id=\'btnTooltip\']")
	public WebElement tooltipButton;
	
	public void getTooltipBeforeClickOperation()
	{
		String tooltipBefore = tooltipButton.getAttribute("data-original-title");
		System.out.println(tooltipBefore);
		
		if(tooltipBefore.equals("You have not clicked this BUTTON yet. Please Click me and check the tooltip"))
		{
			System.out.println("Test Case Passed - Getting Tooltip before Click");
		}
	}
	
	public void getTooltipAfterClickOperation()
	{
		
		String tooltipAfter = tooltipButton.getAttribute("data-original-title");
		System.out.println(tooltipAfter);
		
		if(tooltipAfter.equals("Thank you for being here!"))
		{
			System.out.println("Test Case Passed - Getting Tooltip after Click");
		}
	}
	
	public TooltipsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}

}
