package demo;

public class Pattren {
public static void main(String[] args) {
	
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {	
			
			System.out.print(j+" ");
		}
		
		for(int s=5;s>i;s--) {
			System.out.print("  ");
		}
		
		for(int j=i;j>=1;j--) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		
	}
}
}

//1 2 3 4       4 3 2 1 
//1 2 3         3 2 1 
//1 2           2 1 
//1             1 
