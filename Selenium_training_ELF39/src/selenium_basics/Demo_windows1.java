package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_windows1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");

		// make a note of parent window
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		//Identify facebook link
		
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		Set<String>total=driver.getWindowHandles();
		System.out.println(total);
		
		for(String child:total) {
			System.out.println(child);

			//switch to child
		driver.switchTo().window(child);
		//get title
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
			driver.findElement(By.name("email")).sendKeys("nimitha@gmail");
			
		}
		}
		//switchback to parent window
		driver.switchTo().window(parent_window);
		driver.quit();
		}
}
