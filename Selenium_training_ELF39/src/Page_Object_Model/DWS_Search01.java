package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium_basics.Utility_02;

public class DWS_Search01 extends  Utility_02 {
	
	public DWS_Search01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//WebElement
	@FindBy(id="small-searchterms")
	WebElement search;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	//method
	public void Search_Box(String value) {
		search.sendKeys(value);
	}
	public void Submit_Register() {
	submit.click();
	}
}