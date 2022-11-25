package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo__webshopbooks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(////a[@href=\"/books\"])[1]")).click();
		WebElement select_books=driver.findElement(By.id("products-orderby"));
		
		Select pro=new Select(select_books);
		pro.selectByVisibleText("Price: Low to High");
		Thread.sleep(2000);
		
		WebElement select_display=driver.findElement(By.id("products-pagesize"));

		Select disp=new Select(select_display);
		disp.selectByIndex(2);
		
		WebElement select_grid=driver.findElement(By.id("products-viewmode"));
		
		Select gri=new Select(select_grid);
		gri.selectByVisibleText("List");


	}

}
