package demo;

public class Pattren4 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {	
			
			System.out.print(j+" ");
		}
		
		for(int s=6;s>i;s--) {
			System.err.print("* * ");
		}
		
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		
		System.out.println();
	}
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {	
			
			System.out.print(j+" ");
		}
		
		for(int s=6;s>i;s--) {
			System.err.print("* * ");
		}
		
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		
		System.out.println();
	}
}
}
