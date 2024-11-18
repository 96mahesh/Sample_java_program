package demo;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int n = 153, rev = 0;
		
		while(n>0) {
			
			int rem = n%10;
			//rev += Math.pow(rem, 3);
			rev = rev + rem*rem*rem;
			n = n/10;
				
		}
		
		
		System.out.println(rev);
		
	}
	
}




