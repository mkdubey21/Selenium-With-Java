package seleniumBasics;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromXLS {
//URL to get the binary - http://poi.apache.org/download.html
//	 Binary Name - poi-bin-3.11-beta2-20140822.zip
//	 Extract the binary
//	 Add all the jars from the location you extracted to the build path
//	 Also add all the jars from lib, do not add the jar file of log4j
//	 Also add all the jars from ooxml-lib
//	 Only works for Excel 2007+
	
public static void main(String[] args) {
		
XSSFWorkbook ExcelWBook;
XSSFSheet ExcelWSheet;
XSSFCell Cell;
// Location of the Excel file
//String path = System.getProperty("user.dir")+"//ExcelRead.xlsx";
String path = "D:\\Automation\\Sel_Java\\BasicJava1\\ReadDataFromExcelFile.xlsx";
String sheetName = "Sheet1";
	
try {
			FileInputStream ExcelFile = new FileInputStream(path);
ExcelWBook = new XSSFWorkbook(ExcelFile);
ExcelWSheet = ExcelWBook.getSheet(sheetName);
/*int rowCnt = ExcelWSheet.getLastRowNum();
System.out.println("row cnt: "+rowCnt);
int rowCnt1 = ExcelWSheet.getPhysicalNumberOfRows();
System.out.println("row cnt1: "+rowCnt1);
int colCnt = ExcelWSheet.getRow(1).getPhysicalNumberOfCells();
System.out.println("col cnt: "+colCnt);*/
		
			
/*Cell = ExcelWSheet.getRow(2).getCell(1);
			
System.out.println("Cell Val: "+Cell.toString());
			
int rowCnt1 = ExcelWSheet.getPhysicalNumberOfRows();
			
*/
			
int rowCnt1 = ExcelWSheet.getPhysicalNumberOfRows();
Row newRow = ExcelWSheet.createRow(rowCnt1+1);
Cell = (XSSFCell) newRow.createCell(1);
Cell.setCellValue("New Value");
System.out.println("Done");
} 
catch (Exception e) {
e.printStackTrace();
		}
	}
}

/*
int rowCnt = ExcelWSheet.getLastRowNum();
System.out.println("row cnt: "+rowCnt);
int rowCnt1 = ExcelWSheet.getPhysicalNumberOfRows();
System.out.println("row cnt1: "+rowCnt1);
int colCnt = ExcelWSheet.getRow(1).getPhysicalNumberOfCells();
System.out.println("col cnt: "+colCnt);
int colCnt1 = ExcelWSheet.getRow(1).getLastCellNum();
System.out.println("col cnt1: "+colCnt1);
Cell = ExcelWSheet.getRow(1).getCell(2);
String cellData = Cell.getStringCellValue();
System.out.println("Cell Data: " + cellData);*/