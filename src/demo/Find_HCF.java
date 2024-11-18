package demo;

import java.util.Scanner;

public class Find_HCF {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int hcf = 0;
		for(int i=1;i<=m;i++) {
			if(n%i==0 && m%i==0) {
				hcf = i;
			}
		}
		
		System.out.println(hcf);
		scan.close();
		
	}
}


