package Testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_wth_excel_01 {

	@Test
	
	public void name() throws IOException {
		//filepath
		String filepath="./Testdata/Testdataaa.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		//create object for excel
		Workbook book=new XSSFWorkbook(fis);
		//Accessthe sheet
		Sheet sheet=book.getSheet("Sheet1");
		//Access the row and cell
		int rowcount=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowcount);
		System.out.println(col_count);
		Object[][] data=new Object[rowcount-1][col_count];

		//print all rows amd column 
		for(int row=1;row<=rowcount-1;row++) {
			for(int col=0;col<=col_count-1;col++) {
		//System.out.println(sheet.getRow(row).getCell(column).getStringCellValue());			
		data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
		
				
		}
			System.out.println();
		}
		//String value=sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(value);
		//System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		//System.out.println(sheet.getRow(1).getCell(0).getRichStringCellValue());
		//System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
	for(int i=0;i<data.length;i++) {
		for(int j=0;j<data[i].length;j++) {
			System.out.println(data[i][j]);
		}
		
	
	}
	
}
}
