package selenium_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_index {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nischitha%20h%20s/Downloads/demo.html");
		//	identify the web element of select type
		
		WebElement select_car=driver.findElement(By.id("standard_cars"));
		
		//creating an object for select class
		Select sel=new Select(select_car);
		//select by visible text
		sel.selectByVisibleText("Ford");
		Thread.sleep(2000);
		//select by value
		sel.selectByValue("hda");
		Thread.sleep(2000);
		//select by index
		sel.selectByIndex(9);
		
	}}
