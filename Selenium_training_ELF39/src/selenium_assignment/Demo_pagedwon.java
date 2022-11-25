package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_pagedwon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions macha=new Actions(driver);
		//macha.moveToElement(search).click().sendKeys("mobiles").perform(); 
		macha.sendKeys(search,"mobiles").perform();
		Thread.sleep(2000);
		macha.sendKeys(Keys.PAGE_DOWN).perform();
		
	}

}
