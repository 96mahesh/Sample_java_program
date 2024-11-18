package demo;

public class FibinociiSerieses {

	public static void main(String[] args) {
		
		int n =10;
		int a = 0 , b = 1,c;
		System.out.println(a+" "+b);
		
		do {
			c = a+b;
			if(c>n) {
				break;
			}
		System.out.print(c+" ");
		 a = b;
		 b = c;
			
		}while(c<=n);
	}
}
