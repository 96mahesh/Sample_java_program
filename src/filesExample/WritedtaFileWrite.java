package filesExample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class WritedtaFileWrite {

	public static void main(String[] args) throws Exception{
		File file = new File("./sample.text");
		if(!file.exists())
			file.delete();
		file.createNewFile();
		
		String s = "hello world welcome to new year";
		FileWriter fw = new FileWriter(file);
		
		//fw.write(s);
		//or
		fw.write(s.toCharArray());
//		fos.write(72);
//		fos.write(69);
//		fos.write(76);
//		fos.write(76);
//		fos.write(79);
		
		fw.flush();
		fw.close();
	}
}
