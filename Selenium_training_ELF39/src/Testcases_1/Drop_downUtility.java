package Testcases_1;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_utility.Base_test;
import selenium_basics.Utility_02;

public class Drop_downUtility extends Base_test {
	@DataProvider(name="Apparel")
		Object[][] testdata() {
		Object[][]data=new Object[1][5];
		data[0][0]="short";
		data[0][1]="Jewelry";
		data[0][2]="Tricentis";
		data[0][3]="100";
		data[0][4]="500";
	return data;
	}	
	@Test(dataProvider="Apparel")

		public void nnn(String cc,String mi,String ss,String mm,String mmm) {
		
		WebElement input=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Utility_02.Enter_Value_InTestfield(input,cc);
		
		
		WebElement nn=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Utility_02.Click_Element(nn);
		
		driver.findElement(By.cssSelector("input[id='As']")).click();
		
		WebElement drop=driver.findElement(By.id("Cid"));
		
		Utility_02.drop_down_by_visibleText(drop, mi);
		driver.findElement(By.id("Isc")).click();
		
		WebElement down=driver.findElement(By.id("Mid"));
			Utility_02.drop_down_by_visibleText(down,ss);
			
		WebElement mimi=driver.findElement(By.xpath("//input[@class='price-from']"));
		Utility_02.Enter_Value_InTestfield(mimi, mm);
		
		WebElement mimim=driver.findElement(By.xpath("//input[@class='price-to']"));
		Utility_02.Enter_Value_InTestfield(mimim, mmm);
		
		WebElement nimi=driver.findElement(By.cssSelector("input[id='Sid']"));
		Utility_02.Click_Element(nimi);
		
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();

	}

}
