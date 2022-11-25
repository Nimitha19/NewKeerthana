package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Framework_utility.Base_test;

public class Utility_01 extends Base_test{
	@Test
	public void login() {
	
	WebElement log=driver.findElement(By.cssSelector("a[href=\'/login\']"));
	Utility_02.Click_Element(log);
	
	//driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("niminimitha33@gmail.com");
	WebElement username=driver.findElement(By.cssSelector("input[id='Email']"));
	
	Utility_02.Enter_Value_InTestfield(username,"niminimitha33@gmail.com");
	
	//driver.findElement(By.cssSelector("input[class='password']")).sendKeys("nimitha@19");
	
	WebElement password=driver.findElement(By.cssSelector("input[class='password']"));
	Utility_02.Enter_Value_InTestfield(password,"nimitha@19");
	
	WebElement log_in=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
	Utility_02.Click_Element(log_in);
		
	}
		
	}