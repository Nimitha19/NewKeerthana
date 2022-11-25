package Testcases_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Testcases_Register extends Base_test{
	
	@Test
	public void Browsersetup() {
		
		driver.findElement(By.cssSelector("a[href='/register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-female']")).click();
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]")).sendKeys("nimitha");
		driver.findElement(By.id("LastName")).sendKeys(" h s");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("niminimitha2525@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nimitha@19");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("nimitha@19");
		driver.findElement(By.id("register-button")).click();
		
	}
	
}
