package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Books02 extends Base_test{
	@Test
	
	public void TC01() {
		Register_HomePage hp= new Register_HomePage(driver);
		hp.Book();

	Books01 hs=new Books01(driver);
	hs.options("Name: A to Z");
	hs.name("8");
	hs.add();
	hs.Shops();
}
}
