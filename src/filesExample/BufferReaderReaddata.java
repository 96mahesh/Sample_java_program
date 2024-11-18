package filesExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReaderReaddata {

	public static void main(String[] args)throws Exception {
		File file = new File("./sample.txt");
		if(!file.exists())
		file.createNewFile();
		
		FileReader fr = new FileReader(file);
		BufferedReader  br = new BufferedReader(fr);
//		int asciicode;
//		while((asciicode = br.read())!=-1) {
//			//text = text+String.valueOf((char)asciicode);
//			//text += String.valueOf((char)asciicode);
//			System.out.print((char)asciicode);
//		}
		
		//System.out.println(text);
		String text = "";
		String line = "";
		while((line=br.readLine())!=null) {
			text = text+line+"\n";
		}
		
		System.out.println(text);
	}
}
