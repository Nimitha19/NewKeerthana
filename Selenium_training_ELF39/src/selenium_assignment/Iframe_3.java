package selenium_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Nischitha%20h%20s/Downloads/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		//driver.switchTo().frame("frame1");
		
		//webelement
		
		WebElement exe=driver.findElement(By.id("FR1"));
		driver.switchTo().frame("frame1");

		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();


	}

}
