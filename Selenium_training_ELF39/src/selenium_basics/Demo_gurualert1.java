package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_gurualert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement click=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions action=new Actions(driver);
		action.doubleClick(click).perform();
		Thread.sleep(2000);
		//switching the alert
		Alert ale=driver.switchTo().alert();
		ale.accept();


	}

}
