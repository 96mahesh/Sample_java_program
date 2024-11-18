package demo;

public class Fibinaciiforloop {

	public static void main(String[] args) {
		
		int max = 10;
		int a = 0, b = 1,c;
		
		for(int i=2;i<=max;i++) {
			 c = a+b;
			 a = b;
			 b = c;
			 
			 System.out.println(c);
		}
		
	}
}
