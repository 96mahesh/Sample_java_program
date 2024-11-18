package demo;

public class SumofSum2ndWay {

	public static void main(String[] args) {
		
		int n = 2345, sum = 0;
		
		while(n>0) {
			int rem = n%10;
			    sum = sum+rem;
			      n = n/10;
		}
		System.out.println(sum);
		
		int num = sum, s = 0;
		
		while(num>0) {
			int   r = num%10;
			      s =  s+r;
			    num = num/10;
		}
		System.out.println(s);
	}
}
