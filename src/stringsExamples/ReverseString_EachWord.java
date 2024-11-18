package stringsExamples;

import java.util.Scanner;

public class ReverseString_EachWord {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value of String");
		String original_Value = scan.nextLine();
		String value[] = original_Value.split("");
		String reverseString = " ";
		
		for(int i=0;i<value.length;i++) {
			String word = value[i];
			//System.out.println(word);
			String reverseword = " ";
			

			for(int j=word.length()-1;j>=0;j--) {
				reverseword = reverseword+word.charAt(j);
			}
			reverseString = reverseString+reverseword+" ";
					}
		
		System.out.println(reverseString);
		scan.close();
	}
}
