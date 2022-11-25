package Testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_4 {
	
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Book");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Picture of Health Book']")).click();
		driver.close();
}

}
