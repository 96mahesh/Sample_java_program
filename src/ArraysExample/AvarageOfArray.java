package ArraysExample;

public class AvarageOfArray {
 
	public static void main(String[] args) {
		
		int a[] = {2,5,3,9,6};
		int avg = 0;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
			avg = sum/a.length;
		}
			System.out.println(avg);
	}
}
