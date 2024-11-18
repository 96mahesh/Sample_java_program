package demo;

public class HalfReverseOfArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60};
		
		for(int i=0,j=a.length/2-1;j>i;i++,j--) {
			int temp = a[i];
			    a[i] = a[j];
			    a[j] = temp;
		}
		
		for (int i : a) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		for(int i = a.length/2,j = a.length-1;i<j;i++,j--) {
			int temp = a[i];
		    a[i] = a[j];
		    a[j] = temp;
		}
		
		for (int i : a) {
			System.out.print(i+" ");
		}
		
		
	}
	
	
	
}
