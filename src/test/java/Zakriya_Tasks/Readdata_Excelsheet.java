package Zakriya_Tasks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata_Excelsheet {

	public static void main(String[] args) throws IOException {
		
		String excelFilePath ="C:\\Users\\HP\\Documents\\Excel Sheet(1)..xlsx";
        FileInputStream inputstream=new FileInputStream(excelFilePath);
        
        XSSFWorkbook workbook =new XSSFWorkbook(inputstream);
       
        XSSFSheet sheet=workbook.getSheetAt(0);
       
        //Using for loop
        int rows=sheet.getLastRowNum();
        int cols=sheet.getRow(1).getLastCellNum();
        
        for(int r=0; r<=rows; r++)
        {
        	XSSFRow row=sheet.getRow(r);
        	for(int c=0; c<cols; c++)
        	{
               XSSFCell cell=row.getCell(c);
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
