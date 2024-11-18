package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ReversOfStringEachWord {

	public static void main(String[] args) {
		
		//input java is super  output avaj si repus 
		Scanner scan = new Scanner(System.in);
		System.out.println("Original value is :");
		String originalvalue  = scan.nextLine();
		String value[] = originalvalue.split(" ");
		System.out.println(Arrays.toString(value));
		String reveresesString = "";
		
		for(int i=0;i<value.length;i++) {
			String word = value[i];
			System.out.println(word);
			String reversword = "";
			
			for(int j=word.length()-1;j>=0;j--) {
				reversword = reversword+word.charAt(j);
			}
			//reveresesString = reveresesString+reversword+" ";
			reveresesString = reveresesString+reversword+" ";
		}
		
		System.out.println(reveresesString);
		scan.close();
		
	}
	
}
