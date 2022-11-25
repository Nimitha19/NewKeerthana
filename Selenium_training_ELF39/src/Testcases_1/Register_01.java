package Testcases_1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import selenium_basics.Utility_02;

public class Register_01 extends Base_test
{
@DataProvider(name="TestData")
	
	public Object[][] testdata() throws IOException{
	
		Object[][]data=Utility_02.getTestData("Regi");
	
		
			return data;
	}
		@Test(dataProvider="TestData")
		public void demo(String FN,String LN,String Email,String PWD,String Cpwd) {
		WebElement reg=driver.findElement(By.cssSelector("a[href='/register']"));
		Utility_02.Click_Element(reg);
		
		WebElement gen=driver.findElement(By.cssSelector("input[id='gender-female']"));
		Utility_02.Click_Element(gen);
		
		WebElement name= driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]"));
		Utility_02.Enter_Value_InTestfield(name,FN);
		
		WebElement Lastname=driver.findElement(By.id("LastName"));
		Utility_02.Enter_Value_InTestfield(Lastname,LN);

		WebElement email=driver.findElement(By.cssSelector("input[id='Email']"));
		Utility_02.Enter_Value_InTestfield(email,Email);
		
		WebElement Pass=driver.findElement(By.id("Password"));
		Utility_02.Enter_Value_InTestfield(Pass, PWD);
		
		WebElement conf=driver.findElement(By.name("ConfirmPassword"));
		Utility_02.Enter_Value_InTestfield(conf, Cpwd);
		
		WebElement Reg=driver.findElement(By.id("register-button"));
		Utility_02.Click_Element(Reg);
		
	}

}
