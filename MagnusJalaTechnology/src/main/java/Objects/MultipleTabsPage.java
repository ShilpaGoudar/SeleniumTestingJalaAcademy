package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleTabsPage {

	@FindBy(xpath="//a[contains(text(),'Plan to Succeed')]")
	public WebElement PlanToSucceedTab;
	
	@FindBy(xpath="//a[contains(text(),'UnLearning')]")
	public WebElement UnLearning;
	
	@FindBy(xpath="//a[contains(text(),'Ways of Unlearning')]")
	public WebElement WaysOfUnlearning;
		
		public MultipleTabsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);

	}

}
