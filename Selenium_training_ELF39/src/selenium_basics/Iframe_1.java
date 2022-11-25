package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Nischitha%20h%20s/Downloads/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		//Identify the frame by index
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("a[href='/login']")).click();

	}

}
