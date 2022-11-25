package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_assg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
	    driver.findElement(By.cssSelector("input[id=\'gender-female\']")).click();
	    driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Nimitha");
	    driver.findElement(By.id("LastName")).sendKeys("H S");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("niminimitha45@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nimitha@19");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("nimitha@19");
		driver.findElement(By.id("register-button")).click();
	   
	    String text_value2=driver.findElement(By.cssSelector("div[class='result']")).getText();
		System.out.println(text_value2);
		 String actual="Your registration completed";
	   
	   if(text_value2.equalsIgnoreCase(actual)) {
		   System.out.println("Registered");
	   }
	   else {
		   System.out.println("not registered");
	   }

}
}