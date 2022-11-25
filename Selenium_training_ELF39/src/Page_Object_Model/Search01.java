package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search01 {
	
	public Search01(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@alt='Picture of Denim Short with Rhinestones']")
	WebElement Picture;

	public void Pic() {
		Picture.click();
	}
}