package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Register1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.name("FirstName")).sendKeys("Nimitha");
		driver.findElement(By.id("LastName")).sendKeys("H S");
		//driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.name("Email")).sendKeys("niminimitha33@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nimitha@19");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("nimitha@19");
		driver.findElement(By.id("register-button")).click();
	driver.close();
	}

}
