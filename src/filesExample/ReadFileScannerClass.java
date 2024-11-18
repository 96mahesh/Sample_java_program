package filesExample;

import java.io.File;
import java.util.Scanner;

public class ReadFileScannerClass {
     public static void main(String[] args)throws Exception {
    	 File file = new File("./sample.txt");
 		if(!file.exists())
 		file.createNewFile();
 		//Scanner scan= new Scanner(new FileInputStream(file));
 		Scanner scan= new Scanner(file);
 		while(scan.hasNextLine()) {
 			System.out.println(scan.nextLine());
 		}
 		scan.close();
	}
}
