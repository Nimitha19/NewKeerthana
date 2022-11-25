package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nischitha%20h%20s/Downloads/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Nimitha");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("H S");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TestYantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Katruguppe");

	}

}
