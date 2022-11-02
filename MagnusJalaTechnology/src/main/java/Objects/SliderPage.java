package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPage {
	
	@FindBy(xpath="//*[@id=\'blue\']/div[1]/div[4]")
	public WebElement sliderPointer;
	
	public SliderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

}

}
