package filesExample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class WritedtaBufferWrite {

	public static void main(String[] args) throws Exception{
		File file = new File("./sample.txt");
		if(!file.exists())
			file.delete();
		file.createNewFile();
		
		String s = "hello Mahesh";
        
		BufferedWriter bf = new BufferedWriter(new FileWriter(file));
		bf.write(s);

		
		bf.flush();
		bf.close();
	}
}
