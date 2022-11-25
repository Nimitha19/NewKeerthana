package Testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_withDataprovider {
	
	@DataProvider(name="TestData")
	
	public Object[][] testdata(){
		Object[][]data=new Object[1][2];
		data[0][0]="Nimitha";
		data[0][1]="H S";
		
		return data;
	}
	@Test(dataProvider="TestData")
	public void testdatademo(String Firstname,String Lastname) {
		System.out.println(Firstname);
		System.out.println(Lastname);
	}
}
