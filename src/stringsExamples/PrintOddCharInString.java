package stringsExamples;

import java.util.*;

public class PrintOddCharInString {

	public static void main(String[] args) {
		
		String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
		
		char a[] = name.toCharArray();
		List<Character> res = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(i%2==1)
				res.add(name.charAt(i));
				
		}
		System.out.println(res);
	}
}
