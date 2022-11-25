package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru_rightclick1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions click=new Actions(driver);
		click.contextClick(rightclick).build().perform();

	}

}
