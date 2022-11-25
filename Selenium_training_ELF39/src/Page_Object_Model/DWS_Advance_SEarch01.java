package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium_basics.Utility_02;

public class DWS_Advance_SEarch01  extends Utility_02{
	public DWS_Advance_SEarch01(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Elements
	@FindBy(id="small-searchterms")
	WebElement search;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit2;
	@FindBy(name="As")
	WebElement checkbox1;
	@FindBy(id="Cid")
	WebElement drop;
	@FindBy(name="Isc")
	WebElement checkbox2;
	@FindBy(xpath="(//option[@value='0'])[1]")
	WebElement drop2;
	@FindBy(name="Pf")
	WebElement text;
	@FindBy(name="Pt")
	WebElement text1;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement submit1;
	//methods
	public void Small_Search(String product) {
			search.sendKeys(product);
		}
		public void Submit_Register() {
		submit2.click();
		}
		public void Advance_Search() {
			checkbox1.click();
	}
		public void Catagerory() {
			drop_down_by_visibleText(drop, "Computers");
			
		}
		public void Check_Box2() {
			checkbox2.click();
		}
		public void Drop_Down2() {
			drop2.click();
		}
		public void From_Amt(String amnt) {
			text.sendKeys(amnt);
		}
		public void To_Amt(String amnt) {
			text1.sendKeys(amnt);
		}
		public void Final_Click() {
			submit1.click();
		}
}