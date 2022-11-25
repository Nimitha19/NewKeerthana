package Testcases_1;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test_ola;
import selenium_basics.Utility_02;

public class Ola_Register extends Base_test_ola{
	
	@DataProvider(name="Ola")
	public Object testdata() throws IOException {
		Object data[][]=Utility_02.getTestData("ola");
		return data;
	}
	@Test(dataProvider="Ola")
	public void demo(String number) throws InterruptedException {
		WebElement link=driver.findElement(By.xpath("(//div[@class='list-item'])[1]"));
		Utility_02.Click_Element(link);
		Thread.sleep(2000);
		WebElement nxt=driver.findElement(By.xpath("//a[text()='Next']"));
		Utility_02.Click_Element(nxt);
		
	
		
		WebElement phone=driver.findElement(By.xpath("//a[text()='Continue with phone number']"));
		Utility_02.Click_Element(phone);
		WebElement enter=driver.findElement(By.xpath("//input[@type='number']"));
		Utility_02.Enter_Value_InTestfield(enter,number);
		
		WebElement next=driver.findElement(By.xpath("//a[text()='Next']"));
		Utility_02.Click_Element(next);
	
		
	
		
	}
	

}
