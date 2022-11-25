package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Digital_homepage_02 extends Base_test {
	@Test
	public void  tc01() throws InterruptedException {
		Digital_homepage_01 hp=new Digital_homepage_01(driver);
		hp.Link();
		Thread.sleep(2000);
		hp.dropdown_01();
		Thread.sleep(2000);
		hp.CLASS(driver);
		hp.Name();
	}

}
