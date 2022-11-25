package Testcases_1;

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

public class Testcases_Login extends Base_test{
	
	@DataProvider(name="login")
	public Object[][] testdata(){
		Object[][] data=new Object[1][2];
		data[0][0]="niminimitha33@gmail.com";
		data[0][1]="nimitha@19";
		return data;
	}
	@Test(dataProvider="login")
	public void demo1(String email,String pwd) {
	
	WebElement nn=driver.findElement(By.cssSelector("a[href='/login']"));
	Utility_02.Click_Element(nn);
	
	WebElement nnn=driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
	Utility_02.Enter_Value_InTestfield(nnn, email);
	
	WebElement nnnn=driver.findElement(By.className("password"));
	Utility_02.Enter_Value_InTestfield(nnnn, pwd);
	
	WebElement nnnnn=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
	Utility_02.Click_Element(nnnnn);
		
	}

}
