package selenium_assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_windos2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");

		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);

		Set<String>total=driver.getWindowHandles();
		System.out.println(total);
		
		for(String child:total) {
			System.out.println(child);
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		Thread.sleep(2000);
		driver.close();
	
}}
	
