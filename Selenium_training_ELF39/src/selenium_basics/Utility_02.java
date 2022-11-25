package selenium_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_02 {
	
	// Utility methods for sendkeys
	public static void Enter_Value_InTestfield(WebElement element,String value) {
		element.sendKeys(value);
	}
	//utility methods for click
	
	public static void Click_Element(WebElement element) {
		element.click();
	}
	
	//utility methods for dropdown
	public static void drop_down_by_visibleText(WebElement element,String Text) {
		Select select=new Select(element);
		select.selectByVisibleText(Text);
		
	}
	public static void drop_down_by_value(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public static void drop_down_by_index(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public static void move_To_Element(WebElement element,WebDriver d) {
		Actions action=new Actions(d);
		action.moveToElement(element).build().perform();
	}
	public static String Test_configuration() throws IOException {
	String filepath="./Test_configuration./Test_configuration_properties";
	FileInputStream fis=new FileInputStream(filepath);
	
	//creatr objectbfor properties class
	Properties prop=new Properties();
	prop.load(fis);
	String url=prop.getProperty("URL");
	
	return url;
	}
	
	public static Object[][] getTestData(String sheetname) throws IOException{
		
	
	String filepath="./Testdata/Testdataaa.xlsx";
	
	FileInputStream fis=new FileInputStream(filepath);
	
	Workbook book=new XSSFWorkbook(fis);

	Sheet sheet=book.getSheet(sheetname);
	
	int rowcount=sheet.getPhysicalNumberOfRows();
	int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
	
	Object[][] data=new Object[rowcount-1][col_count];
	


	for(int row=1;row<=rowcount-1;row++) {
		for(int col=0;col<=col_count-1;col++) {
			
	data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
		}
	}
	book.close();
	return data;

		
	}
}


