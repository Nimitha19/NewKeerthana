package Testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo_3 {
	@Parameters({"URL","product"})
	
@Test

	
	
	public void demo(String abc,String def) {
			
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https:www.google.com");
			driver.get(abc);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(def);
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
			driver.close();
}
}
