package filesExample;

import java.io.File;
import java.io.FileInputStream;

public class InputSteam {

	static String text = "";
	public static void main(String[] args) throws Exception {
		
		File file = new File("./sample.txt");
		if(!file.exists())
		file.createNewFile();
		
		FileInputStream instream = new FileInputStream(file);
		
		int asciicode;
		while((asciicode = instream.read())!=-1) {
			text = text+String.valueOf((char)asciicode);
			//text += String.valueOf((char)asciicode);
			//System.out.print((char)asciicode);
		}
		
		System.out.println(text);
		instream.close();
		
	}
}
