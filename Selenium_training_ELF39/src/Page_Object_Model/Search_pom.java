package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Search_pom extends Base_test {
	@Test
	public void Test_case2() {
		DWS_Search01 search=new DWS_Search01(driver);
		search.Search_Box("laptop");
	search.Submit_Register();
	}

}