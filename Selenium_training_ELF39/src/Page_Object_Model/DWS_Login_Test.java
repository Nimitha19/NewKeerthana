package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class DWS_Login_Test extends Base_test{
		@Test
		public void TC01() {
			
			DMS_HomePage hp=new DMS_HomePage(driver);
			hp.Click_Login();
			
			DWS_LoginPage lp=new DWS_LoginPage(driver);
			lp.Enter_username("niminimitha35542653@gmail.com");
			lp.Enter_password("nimitha@19");
			
			lp.Click_Login();
		}
}
