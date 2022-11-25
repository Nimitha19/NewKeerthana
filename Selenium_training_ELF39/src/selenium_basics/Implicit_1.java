package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//create object of webdriverwait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("niminimitha33@gmail.com");
		
		driver.findElement(By.className("password")).sendKeys("nimitha@19");
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
	

	}

}
