package filesExample;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData2 {

	public static void main(String[] args) throws Exception{
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		
		Object empId[][] = {{"EmpId","name","Job"},
				            {"101","Mahesh","Engineer"},
				            {"102","Dinesh","Manager"},
				            {"103","Ramarao","CEO"}};
		
		int rowscount = 0;
		
		for(Object emp[] : empId) {
			XSSFRow row = sheet.createRow(rowscount++);
			int cellcount = 0;
			for(Object value : emp) {
				XSSFCell cell =row.createCell(cellcount++);
				
				if(value instanceof String)
				cell.setCellValue((String)value);
				if(value instanceof Integer )
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((boolean)value);
			}
		}
		
		FileOutputStream fos = new FileOutputStream(".//TestData//empData.xlsx");
		book.write(fos);
		fos.close();
	
}

	
}
