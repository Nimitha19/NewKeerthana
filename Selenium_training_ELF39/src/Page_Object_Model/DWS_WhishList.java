package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium_basics.Utility_02;

public class DWS_WhishList  extends Utility_02{
	public DWS_WhishList(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//element
	@FindBy(xpath="//span[text()=\"Wishlist\"]")
	WebElement wishlist;
public void click_wishlist() {
		wishlist.click();
	}

}