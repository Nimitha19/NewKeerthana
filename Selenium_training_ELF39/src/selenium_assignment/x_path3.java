package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nischitha%20h%20s/Downloads/xpath1.html");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("NIMITHA");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("H S");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Test yantra");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("katruguppe");
		
	}

}
