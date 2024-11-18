package demo;

import java.util.Arrays;

public class String_Angram {

	public static void main(String[] args) {
		
		String s1 = "Divya".toUpperCase();
		String s2 = "ayviD".toUpperCase();
		
//		char a[] = s1.toLowerCase().replace(" ", " ").toCharArray();
//		char b[] = s2.toLowerCase().replace(" ", " ").toCharArray();
//		
//		Arrays.sort(a);
//		Arrays.sort(b);
//		
//		for (char c : a) {
//			System.out.print(c);
//		}
//		System.out.println("\n ============");
//		for (char c : b) {
//			System.out.print(c);
//		}8yy
//		System.out.println("\n ============");
//		boolean status = Arrays.equals(a, b);
//		
//		if(status == true)
//			System.out.println("IS angaram");
//		else 
//			System.out.println("Is not anagaram");
		
		
		
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		char x;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					 x = a[i];
				  a[i] = a[j];
				  a[j] = x;	
				}
			}
		}
		System.out.println(a);
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(b[i]<b[j]) {
					 x = b[i];
				  b[i] = b[j];
				  b[j] = x;	
				}
			}
		}
		System.out.println(b);
		boolean status = Arrays.equals(a, b);
		if(status==true) {
			System.out.println("is anagaram");
		}
		
		else
			System.out.println("is not anagaram");
	}
}
