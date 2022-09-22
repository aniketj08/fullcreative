package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

    public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		//to get path of the excel file
		File path = new File("C:\\Users\\anike\\OneDrive\\Documents\\Jadhao.xlsx");
		
		//Load excel file
		FileInputStream load = new FileInputStream(path);
		
	    XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		FileOutputStream write = new FileOutputStream(path);
		sheet.createRow(5).createCell(5).setCellValue("Automation");
		workbook.write(write);
	}
}
