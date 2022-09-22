package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadFrameworkUtility {
	
	public String readExcel(int sheetNo,int rowNo,int colNo) throws IOException {
		
		File path = new File("C:\\\\Users\\\\anike\\\\OneDrive\\\\Documents\\\\Book1.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet2 = workbook.getSheetAt(sheetNo);
		String data = sheet2.getRow(rowNo).getCell(colNo).getStringCellValue();
		return data;
		}
	public static void main(String[] args)throws IOException {
		
		ExcelReadFrameworkUtility reading = new ExcelReadFrameworkUtility();
		System.out.println(reading.readExcel(0, 0, 1));
		System.out.println(reading.readExcel(0, 1, 1));
	}
	}


