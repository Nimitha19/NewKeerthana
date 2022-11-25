package selenium_basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Nischitha%20h%20s/Desktop/Selenium/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		WebElement fileupload= driver.findElement(By.id("resume"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(fileupload).click().perform();
		
		Thread.sleep(2000);
		//create an object of Robot class
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		
		for(int i=0;i<=2;i++) {
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
			
		}
		robot.keyPress(KeyEvent.VK_CANCEL);	

	}

}
