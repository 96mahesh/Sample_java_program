package filesExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadPdf {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:/Users/Admin/Downloads/My resume.pdf");
		FileInputStream instream = new FileInputStream(file);
		//PDDocument doc = new PDDocument();
		
	
	}
}
