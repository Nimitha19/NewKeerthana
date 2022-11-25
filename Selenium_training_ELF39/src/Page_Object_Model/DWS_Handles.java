package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium_basics.Utility_02;

public class DWS_Handles extends Utility_02 {
	public  DWS_Handles(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="(//a[@target='_blank'])[1]")
WebElement facebook;

public  void Facebook_click() {
	facebook.click();
}
}
