package selenium_assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("nimitha");
		driver.findElement(By.name("submit")).click();
	
		//Switching the alert
		Alert ale=driver.switchTo().alert();
		//handling the alert
		ale.accept();
		
		Thread.sleep(3000);
		
		
		
		driver.close();

	}

}
