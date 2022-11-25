package selenium_assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipule_window3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nischitha%20h%20s/Downloads/MultipleWindow.html");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(2000);
		Set<String>total=driver.getWindowHandles();
		System.out.println(total);
		for(String child:total) {
		 driver.switchTo().window(child);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
	}
}
		