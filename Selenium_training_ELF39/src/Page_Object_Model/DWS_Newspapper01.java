package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium_basics.Utility_02;

public class DWS_Newspapper01 extends Utility_02{

	public DWS_Newspapper01(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
		@FindBy(xpath="(//input[@id=\"newsletter-email\"])[1]")
		WebElement newsletter;
		@FindBy(xpath="(//input[@type=\'button\'])[1]")
		WebElement subscribe;
		public void enter_subscribe_field(String value) {
			Enter_Value_InTestfield(newsletter, value);
		}
		public void click_subscribe() {
			
			Click_Element(subscribe);
		}
}

