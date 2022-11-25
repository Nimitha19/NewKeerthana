package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		//take screenshot type casting with driver instance
		driver.findElement(By.className("ico-login")).click();
		//driver.findElement(By.)
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File homepage=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Screenshot/screenshot1.png");
		FileHandler.copy(homepage, destination);

	}

}
