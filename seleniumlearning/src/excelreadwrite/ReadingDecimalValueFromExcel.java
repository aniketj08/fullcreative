package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDecimalValueFromExcel {
	String value;
	public String readExcel(int sheetNo,int rowNo,int colno)throws IOException {
		
		File path = new File("C:\\\\Users\\\\anike\\\\OneDrive\\\\Documents\\\\Book1.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet2 = workbook.getSheetAt(sheetNo);
		CellType type = sheet2.getRow(rowNo).getCell(colno).getCellType();
		if(type == CellType.NUMERIC) {
			double num = sheet2.getRow(rowNo).getCell(colno).getNumericCellValue();
			 value  = String.valueOf(num);
			return value; 
		}
		else
		{
			value = sheet2.getRow(rowNo).getCell(colno).getStringCellValue();
		return value;
		}
	    }
	
	public static void main (String[] args) throws IOException {
		ReadingDecimalValueFromExcel reading = new ReadingDecimalValueFromExcel();
		System.out.println(reading.readExcel(0, 0, 0));
		System.out.println(reading.readExcel(0, 1, 0));
		
	}}   
