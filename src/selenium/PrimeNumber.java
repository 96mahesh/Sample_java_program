package selenium;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		for(int i=1;i<=7;i++) {
			if(7%i==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
		if(count==2)
			System.out.println("This no is prime");
		else
			System.out.println("This no is not a prime");
			
	}
}
