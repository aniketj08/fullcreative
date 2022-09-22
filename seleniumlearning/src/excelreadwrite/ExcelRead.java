package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File path = new File("C:\\Users\\anike\\OneDrive\\Documents\\Book1.xlsx");
		 FileInputStream load = new FileInputStream(path);
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(load);
		 
		 XSSFSheet sheet2 = workbook.getSheetAt(0);
		 
		 String data = sheet2.getRow(1).getCell(1).getStringCellValue();
		 System.out.println(data);
	}}
