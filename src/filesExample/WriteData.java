package filesExample;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception{
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		
		Object empId[][] = {{"EmpId","name","Job"},
				            {"101","Mahesh","Engineer"},
				            {"102","Dinesh","Manager"},
				            {"103","Ramarao","CEO"}};
		
		int rows = empId.length;
		int cells = empId[0].length;
		
		for(int i=0;i<rows;i++) {
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<cells;j++) {
				XSSFCell cell =row.createCell(j);
				Object value = empId[i][j];
				
				if(value instanceof String)
				cell.setCellValue((String)value);
				if(value instanceof Integer )
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((boolean)value);
			}
		}
		
		FileOutputStream fos = new FileOutputStream(".//TestData//emp.xlsx");
		book.write(fos);
		fos.close();
	
}
	

}
