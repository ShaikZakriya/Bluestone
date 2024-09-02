package Zakriya_Tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Excel_Data {

	public static void main(String[] args) throws IOException {
		
		//To print user ID and password of Rohit Sharma
		
		//1.Create object of workbook
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\Excel Sheet(1).xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    
		//2. Create object for sheet and allocate respective sheet
		
		int numsheet=workbook.getNumberOfSheets();
		
		XSSFSheet sheet = null;
		for(int i=0; i<numsheet; i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Logindata"))
			{	
		        sheet=workbook.getSheetAt(i);
		    }

		//3.Fetch data from sheet using two iterators
			
			Iterator iterator=sheet.rowIterator();
			
				while(iterator.hasNext())
				{
					XSSFRow row=(XSSFRow) iterator.next();
					
					Iterator cellIterator=row.cellIterator();
					
					while(cellIterator.hasNext())
					{
						XSSFCell cell=(XSSFCell) cellIterator.next();
						switch(cell.getCellType())
			               {
			               case STRING: System.out.println(cell.getStringCellValue()); break;
			               case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
			               case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
			               }
			              System.out.println(); 
					}
				}
			  }
			}
		  
}
