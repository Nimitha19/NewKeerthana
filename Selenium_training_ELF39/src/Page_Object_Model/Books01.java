package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import selenium_basics.Utility_02;

public class Books01 {
	
	public Books01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath=" //select[@id='products-orderby']")
	WebElement Click_option;
	
	@FindBy(xpath = "//select[@id='products-pagesize']")
	WebElement drop_down;
	
	@FindBy(xpath = "(//input[@type='button'])[2]")
	WebElement Addcart;
	
	@FindBy(xpath = "(//a[@href='/cart'])[2]")
	WebElement shop;
	
	public void options(String value) {
		Select sel=new Select(Click_option);
		sel.selectByVisibleText(value);
	}

	public void name(String value) {
		Select ss=new Select(drop_down);
		ss.selectByVisibleText(value);
	}
	public void add() {
		Addcart.click();
	}
	public void Shops() {
		shop.click();
	}
	
	
	}