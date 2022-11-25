package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_assg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']")).sendKeys("computer");
		//driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
