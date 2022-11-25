package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_withdataprovider01 {

	@DataProvider(name="TestData")
	
	public Object[][] testdata(){
		Object[][]data=new Object[3][5];
		data[0][0]="Nimitha";
		data[0][1]="H S";
		data[0][2]="niminimitha3333333@gmail.com";
		data[0][3]="nimitha@19";
		data[0][4]="nimitha@19";
		
		data[1][0]="Pammi";
		data[1][1]="raj";
		data[1][2]="rajarajj@gamil.com";
		data[1][3]="nimitha@19";
		data[1][4]="nimitha@19";
		
		data[2][0]="Pammiii";
		data[2][1]="raj";
		data[2][2]="rajarajjjjjj@gamil.com";
		data[2][3]="nimitha@19";
		data[2][4]="nimitha@19";
		
		
		return data;
	}
	@Test(dataProvider="TestData")
	public void testdatademo(String Firstname,String secondname,String email,String Password,String confirm) {
	
	
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.google.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.cssSelector("input[id=\'gender-female\']")).click();
   driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys(Firstname);
   driver.findElement(By.id("LastName")).sendKeys(secondname);
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(Password);
	driver.findElement(By.name("ConfirmPassword")).sendKeys(confirm);
	driver.findElement(By.id("register-button")).click();
	driver.close();
}
}

