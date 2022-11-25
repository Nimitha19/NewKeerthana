package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_contactus {
	public DWS_contactus(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[contains(text(), 'Contact us')]")
	WebElement contact;
	@FindBy(id="FullName")
	WebElement fullname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(name="Enquiry")
	WebElement enq;
	@FindBy(name="send-email")
	WebElement send;
	
	public void click() {
		contact.click();
	}
	public void Enter_name() {
		fullname.sendKeys("Nimitha");
	}
	public void Enter_email() {
		email.sendKeys("niminimitha33@gmail.com");
	}
	public void Enquriy_details() {
		enq.sendKeys("jsrhgfsdhfjhsk");
	}
	public void Sen_Email() {
		send.click();
	}
	}