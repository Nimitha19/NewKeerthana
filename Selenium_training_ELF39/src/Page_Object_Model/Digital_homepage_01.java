package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium_basics.Utility_02;

public class Digital_homepage_01 extends Utility_02 {
		public Digital_homepage_01(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
		WebElement link;
		@FindBy(xpath="//select[@id='products-orderby']")
		WebElement dropdown;
		@FindBy(xpath = "(//input[@type=\"button\"])[3]")
		WebElement name;
		@FindBy(xpath = "(//span[@class='cart-label'])[1]")
		WebElement classs;
		@FindBy(xpath="//input[@class='button-1 cart-button']")
		WebElement ddd;

public void Link() {
	link.click();
}			
public void dropdown_01() {
	drop_down_by_visibleText(dropdown,"Name: Z to A");
}
public void CLASS(WebDriver d) {
move_To_Element(classs,d);
}
public void Name() {
	name.click();
}
public void DDD() {
	ddd.click();
}


}