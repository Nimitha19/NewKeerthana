package Testcases_1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import selenium_basics.Utility_02;


public class Testcase_Search extends Base_test{
	
	@DataProvider(name="search")
	
	public Object[][] testdata() throws IOException{
		
		Object[][]data=Utility_02.getTestData("Search");
	
		return data;
	}
	@Test(dataProvider="search")
		public void demo1(String one) {
		
	WebElement input=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	Utility_02.Enter_Value_InTestfield(input, one);
	
	WebElement submit=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	Utility_02.Click_Element(submit);
	WebElement img=driver.findElement(By.xpath("//img[@alt='Picture of Denim Short with Rhinestones']"));
	Utility_02.Click_Element(img);

}
	
}
