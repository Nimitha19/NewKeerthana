package Testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_withDataprovider_1 {

@DataProvider(name="TestData")
	
	public Object[][] testdata(){
		Object[][]data=new Object[8][2];
		data[0][0]="Nimitha";
		data[0][1]="H S";
		data[1][0]="Chethan";
		data[1][1]="N K";
		data[2][0]="Nischitha";
		data[2][1]="H S";
		data[3][0]="Pramodaaa";
		data[3][1]="yakrooo";
		data[4][0]="Ragu";
		data[4][1]="Kasyap";
		data[5][0]="San";
		data[5][1]="san";
		data[6][0]="heena";
		data[6][1]="mehak";
		data[7][0]="Prathiksha";
		data[7][1]="jghjhf";
		
		return data;
	}
	@Test(dataProvider="TestData")
	public void testdatademo(String Firstname,String Lastname) {
		System.out.println(Firstname);
		System.out.println(Lastname);
}
}
