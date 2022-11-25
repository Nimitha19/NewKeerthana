package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_BrowserMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	//Navigate to website
		driver.get("https://www.google.co.in");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver drivers=new FirefoxDriver();
		driver.get("https://www.myntra.co.in");
		
	}
}

