package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Original Value is :");
	String originalvalue  = scan.nextLine();
	String a[] = originalvalue.split(" ");
	//System.out.println(Arrays.toString(a));
	String reversedString = " ";
	for(int i=0;i<a.length;i++) {
		String word = a[i];
		//System.out.println(word);
		String reversedword = " ";
		
		for(int j=word.length()-1;j>=0;j--) {
			reversedword = reversedword+word.charAt(j);
		}
		reversedString = reversedString+reversedword+" ";
		
	}
	System.out.println(reversedString);
	ReverseEachWordInString.Reverse();
	ReverseMethod.main();
	scan.close();
	}	
      
}

class ReverseEachWordInString{
	public static void Reverse() {
		
		String name = "welcome to java and selenium";
		String a[] = name.split(" ");
		String reverseString = " ";
		for (String w : a) {
			
			String reverseword = " ";
			for(int i=w.length()-1;i>=0;i--) {
				reverseword = reverseword+w.charAt(i);
			}
			reverseString = reverseString+reverseword+" ";
		}
		
		System.out.println(reverseString);
	}
}

class ReverseMethod{
	
	public static void main() {
		
		String name = "mahesh babu atomation engineer";
		String words[] = name.split(" ");
		String reverseString = " ";
		for (String w : words) {
			
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverseString = reverseString+sb.toString()+" ";
		}
		System.out.println(reverseString);
	}
}