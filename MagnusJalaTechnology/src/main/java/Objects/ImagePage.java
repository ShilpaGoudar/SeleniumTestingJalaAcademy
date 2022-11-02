package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagePage {
	
	@FindBy(xpath = "//*[@id=\'file\']")
	public WebElement ChooseFile;
	
	@FindBy(xpath = "//*[@id=\'frmImages\']/div/div/div[1]/div[3]/button")
	public WebElement upload;
	
	public ImagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}

}
