package demo;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		
//		String name = "Automation";
//		char a[] = name.toCharArray();
//		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]);
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Size Is :");
		String name = scan.next();
		char a[] =name.toCharArray();
		for(int i=0;i<a.length;i++) {
			System.out.println("Eneter array value");
			a[i] = scan.next().charAt(i);
		}
		
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			
			char temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
			     
		}
		for (char i : a) {
			System.out.print(i);
		}
	}
}
