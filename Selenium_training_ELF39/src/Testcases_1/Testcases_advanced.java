package Testcases_1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import selenium_basics.Utility_02;

public class Testcases_advanced extends Base_test {
@DataProvider(name="search")
	
	public Object[][] testdata() throws IOException{
		
		Object[][]data=Utility_02.getTestData("add");
	
		return data;
}
	@Test(dataProvider="search")
	public void deno1(String ss,String num,String nni,String mm,String cc) {
		
		WebElement nimi=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Utility_02.Enter_Value_InTestfield(nimi, ss);
		WebElement nim=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Utility_02.Click_Element(nim);
		
		WebElement ni=driver.findElement(By.cssSelector("input[id='As']"));
		Utility_02.Click_Element(ni);
		
		WebElement drop=driver.findElement(By.id("Cid"));
		Utility_02.Click_Element(drop);
		Utility_02.drop_down_by_visibleText(drop, num);
		WebElement n=driver.findElement(By.id("Isc"));
		Utility_02.Click_Element(n);
		
		WebElement down=driver.findElement(By.id("Mid"));
		Utility_02.Click_Element(down);
		Utility_02.drop_down_by_visibleText(down,nni);
		
		WebElement ns=driver.findElement(By.xpath("//input[@class='price-from']"));
		Utility_02.Enter_Value_InTestfield(ns, mm);
		WebElement nss=driver.findElement(By.xpath("//input[@class='price-to']"));
		Utility_02.Enter_Value_InTestfield(nss, cc);
		
		driver.findElement(By.cssSelector("input[id='Sid']")).click();
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();

}
}
