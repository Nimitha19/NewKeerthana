package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_relativexpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Nimitha");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("H S");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("niminimitha343@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("nimitha@19");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("nimitha@19");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

}
