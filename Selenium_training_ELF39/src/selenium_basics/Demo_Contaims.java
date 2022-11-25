package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Contaims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		driver.findElement(By.xpath("//input[contains(@autofocus,'autofocus')]")).sendKeys("niminimitha33@gmail.com");
		driver.findElement(By.xpath("//a[contains(@href,'/passwordrecovery')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'email')]")).sendKeys("niminimitha33@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'send-email')]")).click();
	}

}
