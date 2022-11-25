package selenium_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nischitha%20h%20s/Downloads/demo.html");
		List<WebElement>Text=driver.findElements(By.xpath("//input[@type=\"text\"]"));
		for(int i=0;i<=Text.size();i++) {
			if(i%2==0) {
		Text.get(i).sendKeys("NIMITHA");
		}
			else {
				Text.get(i).sendKeys("Chethan");
			}
		}
		
}
}