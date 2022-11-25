package selenium_assignment;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gruru_rightclick2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		Actions click=new Actions(driver);
		Thread.sleep(3000);
		List<WebElement>options=driver.findElements(By.xpath("//span[contains(text(),'Edit')]/../../li/span"));
		for(int i=0;i<options.size();i++) {
			
			click.contextClick(rightclick).build().perform();
			Thread.sleep(2000);
			options.get(i).click();
			Alert ale=driver.switchTo().alert();
			ale.accept();
		}
	
	}

	
}
