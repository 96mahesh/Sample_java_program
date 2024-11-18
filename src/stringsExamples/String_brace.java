package stringsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class String_brace {

	public static void main(String[] args) {
		
		String name = "{}{}{}";
		char a[] = name.toCharArray();
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					char temp = a[i];
					    a[i] = a[j];
					    a[j] = temp;
				}
			}
		}
		
		for (char c : a) {
			System.out.print(c);
		}
		
		System.out.println();
		string.m1(args);
	}
}

class string{
	public static void m1(String[] args) {
		String name = "{}{}{}";
		List<String> ls = new ArrayList<String>();
		String data = "";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i) >= '{' || name.charAt(i) < '}') {
				char x = name.charAt(i);
				data = String.valueOf(x);
				ls.add(data);
			}
			
			
		}
	     System.out.println(ls);
		
	
	}
}
