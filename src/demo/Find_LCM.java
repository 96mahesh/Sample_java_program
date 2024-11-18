package demo;

import java.util.Scanner;

public class Find_LCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		//int max = (x>y) ? x : y;
		//System.out.println(max);
		int lcm = 0;
		
		for(int i=y;i<=x*y;i+=y) {
			if(i%x==0 && i%y==0)
				lcm = i;
			break;
			}
			
		System.out.println(lcm);
		
		scan.close();
	}
}
