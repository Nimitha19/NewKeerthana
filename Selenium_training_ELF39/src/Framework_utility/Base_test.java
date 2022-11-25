package Framework_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import selenium_basics.Utility_02;

public class Base_test {
  public WebDriver driver;
	
	@BeforeClass
	//test case
	
	public void demo() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		String url=Utility_02.Test_configuration();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
	@AfterClass
	public void hi() {
		driver.close();
	} 
}
