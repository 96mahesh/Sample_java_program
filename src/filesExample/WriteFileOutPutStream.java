package filesExample;

import java.io.File;
import java.io.FileOutputStream;

public class WriteFileOutPutStream {

	public static void main(String[] args) throws Exception{
		File file = new File("./sample.txt");
		if(!file.exists())
			file.delete();
		file.createNewFile();
		
		String s = "hello";
		FileOutputStream fos = new FileOutputStream(file);
		for (char ch : s.toCharArray()) {
			fos.write((int)ch);
		}
//		fos.write(72);
//		fos.write(69);
//		fos.write(76);
//		fos.write(76);
//		fos.write(79);
		
		fos.flush();
		fos.close();
	}
}
