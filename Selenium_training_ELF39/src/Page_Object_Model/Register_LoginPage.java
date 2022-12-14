package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_LoginPage {
	
	public Register_LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement gendrclick;

	@FindBy(xpath="(//input[@class='text-box single-line'])[1]")
	WebElement Firstname;
	
	@FindBy(xpath="(//input[@class='text-box single-line'])[2]")
	WebElement Lastname;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(xpath="(//input[@class=\"text-box single-line password\"])[1]")
	WebElement Password;
	
	@FindBy(xpath="(//input[@class=\"text-box single-line password\"])[2]")
	WebElement ConPassword;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement Register_button;

	public void Gend_link() {
		gendrclick.click();
	}
	public void Enter_Firstname(String value) {
		Firstname.sendKeys(value);
	}
	public void Enter_Lastname(String value) {
		Lastname.sendKeys(value);
	}
	public void Enter_Email(String value) {
		Email.sendKeys(value);
	}
	public void Enter_Password(String value) {
		Password.sendKeys(value);
	}
	public void Enter_confpassword(String value) {
		ConPassword.sendKeys(value);
	}
	public void Reg_link() {
		
		Register_button.click();
		
	}
	
	
	
	
	
	
	
}




