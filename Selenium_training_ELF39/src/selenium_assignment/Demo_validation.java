package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[href=\'/login\']")).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("niminimitha33@gmail.com");
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("nimitha@19");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		String actual=driver.findElement(By.cssSelector("a[href='/customer/info']")).getText();
		System.out.println(actual);
		String name="niminimitha33@gmail.com";
		if(actual.equalsIgnoreCase(name)) {
			System.out.println("logged in");
		}
		else {
			System.out.println("invalid");
		}
	}

}
