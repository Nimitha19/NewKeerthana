package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_keysdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions macha=new Actions(driver);
		macha.moveToElement(search).click().perform();
	//	macha.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).perform();
		macha.keyDown(Keys.LEFT_SHIFT).sendKeys("mobiles").keyUp(Keys.LEFT_SHIFT).perform();
		Thread.sleep(2000);
	}

}
