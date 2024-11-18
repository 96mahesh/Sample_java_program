package demo;

import java.util.Scanner;

public class Find_Hcf_5_digits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entar values");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();
		
		int hcf = 0;
		
		for(int i=1;i<=n5;i++) {
			if(n1%i==0 && n2%i==0 && n3%i==0 && n4%i==0 && n5%i==0) {
				hcf = i;
			}
		}
		System.out.println(hcf);
				scan.close();
	}
}
