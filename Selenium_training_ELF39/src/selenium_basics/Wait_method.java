package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//create object of webdriverwait
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		WebDriverWait wait=new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email")))).sendKeys("niminimitha33@gmail.com");
		
		driver.findElement(By.className("password")).sendKeys("nimitha@19");
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
	
		String value=driver.findElement(By.xpath("(//a[@href=\"/customer/info\"])[1]")).getText();
		//System.out.println(value);
		if(value.equalsIgnoreCase("niminimitha33@gmail.com")) {
			System.out.println("pass");
		}
		
	}

}
