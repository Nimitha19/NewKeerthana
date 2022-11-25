package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Vote_pom  extends Base_test{
	@Test
	public void Test_case1() throws InterruptedException {
		DWS_Vote vote=new DWS_Vote(driver);
		vote.Select_Vote();
		Thread.sleep(2000);
		
		vote.place_vote();
}
}