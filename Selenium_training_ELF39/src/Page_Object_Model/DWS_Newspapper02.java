package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class DWS_Newspapper02 extends Base_test {

		
		@Test
public void Newsletter() {
			DWS_Newspapper01 news=new DWS_Newspapper01(driver);
			news.enter_subscribe_field("niminimitha33gmail.com");
			news.click_subscribe();

		}
}