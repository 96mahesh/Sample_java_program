package collections;

import java.util.ArrayList;
import java.util.List;

public class Assignment {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		ls.add("Mahesh");
		ls.add("Pawan");
		ls.add("Ram");
		ls.add("1234");
		ls.add("4567");
		
	    String word = "";
		for (String str : ls) {
			if(str.charAt(0) >= 'A' || str.charAt(0)<= 'Z') {
				;
			}
		}
		
		System.out.println(word);
		}
	
	}

