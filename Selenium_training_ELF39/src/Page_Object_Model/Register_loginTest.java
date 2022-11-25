package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;


public class Register_loginTest extends Base_test{
	@Test
	
	public void TC01() {
		Register_HomePage hp= new Register_HomePage(driver);
		hp.Click_link();
	
		Register_LoginPage hh=new Register_LoginPage(driver);
		hh.Gend_link();
		hh.Enter_Firstname("Nimitha");
		hh.Enter_Lastname("h s");
		hh.Enter_Email("niminimtha353346465@gmail.com");
		hh.Enter_Password("nimitha@19");
		hh.Enter_confpassword("nimitha@19");
		hh.Reg_link();
}
}
