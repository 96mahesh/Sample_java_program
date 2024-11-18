package filesExample;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellWriteData {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Sheet1");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Mahesh");
		sheet.getRow(0).createCell(1).setCellValue("Babu");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Pawan");
		sheet.getRow(1).createCell(1).setCellValue("Kalyan");
		
		FileOutputStream fos = new FileOutputStream("C:\\Mahesh\\Mahesh\\Sample\\TestData\\Info1.xlsx");
		book.write(fos);
		fos.close();
		
	}
}
