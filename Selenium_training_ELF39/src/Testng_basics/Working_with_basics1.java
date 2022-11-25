package Testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_basics1 {

	 @Test

	 public void demo() {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 driver.findElement(By.className("radioButton")).click();
		 driver.findElement(By.id("autocomplete")).sendKeys("India");

	}

}
