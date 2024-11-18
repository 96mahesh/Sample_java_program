package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ExcellReader {
	Browser b;

	public static String getData(String filename, String key) throws Exception {

		String filepath = ".//Locaters//" + filename + ".properties";
		FileInputStream instream = new FileInputStream(filepath);

		Properties pro = new Properties();
		pro.load(instream);
		return pro.getProperty(key);
	}

	
	public static void main(String[] args) throws Exception {
		String email = ExcellReader.getData("config", "url");
		System.out.println(email);
	}
}
