package ArraysExample;

import java.util.Arrays;

public class ReversOfStringArray {

	public static void main(String[] args) {
		
		String a[] = {"true","false","false","true","false","true"};
		
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			String temp = a[i];  
			       a[i] = a[j];
			       a[j] = temp;
		}
		for (String x : a) {
			System.out.print(x+" ");	
		}
	}
}
