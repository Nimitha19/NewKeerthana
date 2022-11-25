package Testcases_1;

import java.io.IOException;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import selenium_basics.Utility_02;

public class Working_with_data_login extends Base_test {
@DataProvider(name="TestData")
	
	public Object[][] testdata() throws IOException{
		Object[][]data=Utility_02.getTestData("login");
		
		return data;
	}
	@Test(dataProvider="TestData")
	public void testdatademo(String Email,String Password) {
		
	WebElement log=driver.findElement(By.cssSelector("a[href=\'/login\']"));
   Utility_02.Click_Element(log);
	
	
   WebElement email=driver.findElement(By.cssSelector("input[id='Email']"));
   Utility_02.Enter_Value_InTestfield(email, "Email");
   
   WebElement password=driver.findElement(By.cssSelector("input[class='password']"));
   Utility_02.Enter_Value_InTestfield(password, "Password");
   
   WebElement click=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
   Utility_02.Click_Element(click);
	
   WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
	Utility_02.Click_Element(logout);
}
}

