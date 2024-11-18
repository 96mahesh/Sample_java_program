
package demo;

public class sumOfIntegers {

	public static void main(String[] args) {
	
		int n = 123 , rev = 0;
		
		while(n>0) {

		int div = n%10;
		rev = rev+div;
		n = n/10;

		}

		System.out.println(rev);
		
		
			}
}

/*int n = 123 , rev = 0;
while(n>0) {

int div = n%10;
rev = rev+div;
n = n/10;

}

System.out.println(rev);
*/