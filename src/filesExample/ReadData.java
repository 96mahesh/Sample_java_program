package filesExample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static int getData(String filename , int row , int cell) throws IOException {
		
		FileInputStream instream = new FileInputStream("C:\\Mahesh\\Mahesh\\Sample\\Testata\\"+filename+".xlsx");
		XSSFWorkbook book = new XSSFWorkbook(instream);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int data = (int)sheet.getRow(row).getCell(cell).getNumericCellValue();
		return data;
		
	}
	
	public static void main(String[] args) throws IOException {
		int data = ReadData.getData("info", 0, 1);
		System.out.println(data);
	}
}
