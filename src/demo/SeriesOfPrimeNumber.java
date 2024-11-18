package demo;

public class SeriesOfPrimeNumber {

	public static void main(String[] args) {
		
		int lw = 900 , up = 1000;
		int count = 0;
		for(int i=lw;i<=up;i++) {
			int fact = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					fact++;
			}
			
			if(fact==2) {
				System.out.println(i);
				count++;
			}
		}
	System.out.println(count);
	}
}
