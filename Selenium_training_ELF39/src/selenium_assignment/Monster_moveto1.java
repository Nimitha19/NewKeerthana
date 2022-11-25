package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Monster_moveto1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.monsterindia.com/");
		//identify the web element which i have to mouse over it
		WebElement computer=driver.findElement(By.xpath("(//a[@data-check='menutab'])[1]"));
		Actions gud=new Actions(driver);
		gud.moveToElement(computer).build().perform();
		Thread.sleep(2000);
		
		gud.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"))).click().perform();

		
		gud.moveToElement(driver.findElement(By.xpath("(//a[contains(@onclick,'window')])[24]"))).click().perform();

	}

}
