package selenium_assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//using navigatr-to
		driver.get("https://www.google.co.in");
		driver.navigate().to("https://www.amazon.co.in");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//close the browser
		driver.close();
	}

}
