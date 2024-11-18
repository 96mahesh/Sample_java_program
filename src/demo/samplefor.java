package demo;

import java.util.Scanner;

public class samplefor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int post=0,neg=0,zero=0;
		for(;;) {
		System.out.println("Differerny Values");
		int n = scan.nextInt();
		if(n>0 && n!=999)
			post++;
		else if(n<0)
			neg++;
		else if(n!=999)
		    zero++;
		if(n==999)
			break;
		}
		System.out.println("Positive :"+post+"\n Negitive :"+neg+"\n Zero :"+zero);
		scan.close();
	}
}
