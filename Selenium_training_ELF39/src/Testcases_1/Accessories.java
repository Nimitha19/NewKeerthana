package Testcases_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import selenium_basics.Utility_02;

public class Accessories extends Base_test{
	
@Test
	public void demo1() {
		
		WebElement dd=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		Utility_02.move_To_Element(dd, driver);
		WebElement ddd=driver.findElement(By.xpath("(//a[@href='/notebooks'])[1]"));
		Utility_02.Click_Element(ddd);
		
}
	
}

	


















