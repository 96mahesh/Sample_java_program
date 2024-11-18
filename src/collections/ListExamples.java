package collections;

import java.util.Scanner;

public class ListExamples {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = scan.nextInt();
		System.out.println("Enter Array Value ");
		int a[] = new int[size];
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		
		for (int i : a) {
			System.out.print(i);
		}
		
		System.out.println("\n ===================");
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
		scan.close();
	}
}
