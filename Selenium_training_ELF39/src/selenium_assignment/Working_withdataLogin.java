package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_withdataLogin {
	

	@DataProvider(name="TestData")
	
	public Object[][] testdata(){
		Object[][]data=new Object[5][2];
		data[0][0]="niminimitha3333333@gmail.com";
		data[0][1]="nimitha@19";
		
		data[1][0]="rajarajj@gamil.com";
		data[1][1]="nimitha@19";
		
		data[2][0]="rajarajjjjjj@gamil.com";
		data[2][1]="nimitha@19";
		
		data[3][0]="niminimitha33@gmail.com";
		data[3][1]="nimitha@19";
		
		data[4][0]="niminimitha333@gmail.com";
		data[4][1]="nimitha@19";
		
		return data;
	}
	@Test(dataProvider="TestData")
	public void testdatademo(String Email,String password) {
	
		
	
	
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.google.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.findElement(By.cssSelector("a[href=\'/login\']")).click();
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys(Email);
	driver.findElement(By.cssSelector("input[class='password']")).sendKeys(password);
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
	driver.close();
}
}
