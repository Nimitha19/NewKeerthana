package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Search02 extends Base_test {
	@Test
	public void TC1() {
		Register_HomePage hp = new Register_HomePage(driver);
		hp.Search("short");
		hp.Button();
		
		
		Search01 hs= new Search01(driver);
		hs.Pic();
		
	}

}
