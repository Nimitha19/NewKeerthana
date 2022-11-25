package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Action_Class {
	public class DWS_ComputersTest extends Base_test{
			@Test
			public void Computer() {
				DWS_Homepage_computers hp=new DWS_Homepage_computers(driver);
				hp.click_electronics();
			}
		}

}