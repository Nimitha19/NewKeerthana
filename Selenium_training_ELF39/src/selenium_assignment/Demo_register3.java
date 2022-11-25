package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_register3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("search-box-text ui-autocomplete-input")).click();
		driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("Computer");
		driver.findElement(By.className("button-1 search-box-button")).click();
		driver.close();
	}

}
