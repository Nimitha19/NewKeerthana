package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("niminimitha333@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("nimitha@19");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//input[@id='pollanswers-4']")).click();
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		//driver.close();

	}

}
