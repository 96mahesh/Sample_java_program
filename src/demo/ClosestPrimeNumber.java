package demo;

public class ClosestPrimeNumber {

	public static void main(String[] args) {
		
		int n = 20;
		
		int pre = 0;
		
		for(int i=1;i<=n;i++) {
			int fact = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					fact++;
				}
				}
			if(fact==2) {
				if(pre<i)
					pre = i;
				
				
			}
			
			
		}
		System.out.println(pre);
	}
}
