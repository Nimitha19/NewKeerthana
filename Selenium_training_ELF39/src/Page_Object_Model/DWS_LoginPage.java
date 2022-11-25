package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_LoginPage {
	//constructor
	
	public DWS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//webelemts
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	

	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_btn;
	
	//methods
	
	public void Enter_username(String value) {
		username.sendKeys(value);
		
	}
	public void Enter_password(String value) {
		password.sendKeys(value);
	
	}
	public void Click_Login() {
		login_btn.click();
	}

}
