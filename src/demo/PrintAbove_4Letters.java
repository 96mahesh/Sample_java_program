package demo;

import java.util.ArrayList;
import java.util.List;

public class PrintAbove_4Letters {

	public static void main(String[] args) {
		
		String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
		String a[] = name.split(" ");
		List<String> res = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			if(word.length()>4)
				res.add(a[i]);
		}
		System.out.println(res);
		System.out.println();
		PrintAnove_4LettersWord.main();
	}
}

class PrintAnove_4LettersWord{
	
	public static void main() {
		String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
		String a[] = name.split(" ");
		String res = "";
		
		for (String c : a) {
			if(c.length()>4)
				res = res+c+" ";
		}
		
		System.out.println(res);
	} 
	
	
	
}
