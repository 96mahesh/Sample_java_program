package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OutPutStreamExample {
	
	public static void main(String[] args) throws Exception{
		
        FileInputStream instream = new FileInputStream("C:\\Mahesh\\Mahesh\\Sample\\TestData\\Info.xlsx");
        XSSFWorkbook  book = new XSSFWorkbook(instream);
        XSSFSheet sheet = book.getSheet("Sheet1");
        
        Row row = sheet.createRow(3);
        
        Cell rowofcell = row.createCell(4);
        
        rowofcell.setCellValue("Selenium");
        
        FileOutputStream outstream = new FileOutputStream("C:\\Mahesh\\Mahesh\\Sample\\TestData\\Info.xlsx");
        book.write(outstream);
        
      //  "C:\\Mahesh\\Mahesh\\Sample\\TestData\\info"
	}

}
