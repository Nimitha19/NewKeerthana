package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DMS_HomePage {
	//constructor- to iniTialize the driver instance and webelements
	public DMS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//WebElements
	@FindBy(xpath="//a[@href='/login']")
	WebElement login_link;
	
	//Method
	public void Click_Login() {
		login_link.click();
	}

}
