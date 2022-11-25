package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Jewelry_02 extends Base_test{
	@Test
	
	public void Jewelry_02() {
		
		Jewelry_01 nn= new Jewelry_01(driver);
		nn.Clickjew();
		nn.cart();
		nn.view();
		nn.mark();
		nn.help();
			
	}

}
