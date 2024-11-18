package filesExample;

import java.io.File;
import java.io.FileReader;

public class FileReaderReaddata {

	public static void main(String[] args)throws Exception {
		File file = new File("./sample.txt");
		if(!file.exists())
		file.createNewFile();
		
		FileReader fr = new FileReader(file);
		int asciicode;
		while((asciicode = fr.read())!=-1) {
			//text = text+String.valueOf((char)asciicode);
			//text += String.valueOf((char)asciicode);
			System.out.print((char)asciicode);
		}
		
		//System.out.println(text);
		fr.close();
	}
}
