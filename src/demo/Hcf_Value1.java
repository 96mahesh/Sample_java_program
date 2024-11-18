package demo;

import java.util.Scanner;

public class Hcf_Value1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		
		int x  = scan.nextInt();
		int y = scan.nextInt();
		int backup = 0;
		while(y!=0) {
			backup = x;
			x=y;
			y = backup%y;
		}
		
		System.out.println(x);
		scan.close();
	}
}
