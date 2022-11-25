package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class contact_DWS02 extends Base_test {
	@Test
	public void contact() {
	DWS_contactus con=new DWS_contactus(driver);
	con.click();
	con.Enter_name();
	con.Enter_email();
	con.Enquriy_details();
	con.Sen_Email();
	}
}