package Page_Object_Model; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_HomePage {
	
	 
	public Register_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/register']")
	WebElement Reg_link;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement Search_link; 
	
	@FindBy(xpath="(//input[@type='submit'])[1]" )
	WebElement button;
	
	@FindBy(xpath = " (//a[@href='/books'])[1]")
	WebElement Books;
	
	public void Click_link() {
		Reg_link.click();	
	}
	public void Search(String value) {
		Search_link.sendKeys(value);
	}
	public void Button() {
		button.click();
	}
	public void Book() {
		Books.click();
	}
}
