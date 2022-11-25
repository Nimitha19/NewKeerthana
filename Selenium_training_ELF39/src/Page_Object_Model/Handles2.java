package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Handles2 extends Base_test{

	@Test
	public void T3est_case() {
		DWS_Handles scroll=new DWS_Handles(driver);
		scroll.Facebook_click();
		
	}
}
