package demo;

public class fibnociiWhile {

	public static void main(String[] args) {
		
		int max =10;
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		
		while(c<=max) {
			c=a+b;
			if(c>max)
				break;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
