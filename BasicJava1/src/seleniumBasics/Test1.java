package seleniumBasics;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.rowset.internal.Row;

public class Test1 {

	
public static void main(String[] args) {
		
//XSSFWorkbook ExcelWBook;
//XSSFSheet ExcelWSheet;
XSSFCell Cell;
// Location of the Excel file
//String path = System.getProperty("user.dir")+"//ExcelRead.xlsx";
String path = "D:\\Automation\\Sel_Java\\BasicJava1\\ReadDataFromExcelFile.xlsx";
String sheetName = "Sheet1";
	
try {
			FileInputStream ExcelFile = new FileInputStream(path);
			 @SuppressWarnings("resource")
			XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
			 XSSFSheet ExcelWSheet = ExcelWBook.getSheet(sheetName);

int rowCnt = ExcelWSheet.getLastRowNum();
System.out.println("row cnt: "+rowCnt);
Cell = ExcelWSheet.getRow(2).getCell(1);
System.out.println("Cell Val: "+Cell.toString());



} 
catch (Exception e) {
e.printStackTrace();
		}
	}
}

