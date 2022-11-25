package Page_Object_Model;

import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Advances_search_pom2 extends Base_test {
@Test
public void Advance_Test() {
	DWS_Advance_SEarch01 advance=new 	DWS_Advance_SEarch01(driver);
		advance.Small_Search("mobiles");
		advance.Submit_Register();
		advance.Advance_Search();
		advance.Catagerory();
		advance.Check_Box2();
		advance.Drop_Down2();
		advance.From_Amt("1000");
		advance.To_Amt("5000");
		advance.Final_Click();
}



}