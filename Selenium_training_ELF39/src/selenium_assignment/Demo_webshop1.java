package selenium_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_webshop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/books");
		//driver.findElement(By.xpath("(////a[@href=\"/books\"])[1]")).click();
		WebElement select_books=driver.findElement(By.id("products-orderby"));
		
		Select pro=new Select(select_books);
		
		List<WebElement>pro1=pro.getOptions();
		for(int i=0;i<=pro1.size()-1;i++){
			System.out.println(pro1.get(i).getText());
				

	}

}}


