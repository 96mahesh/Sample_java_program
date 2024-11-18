package ArraysExample;

import java.util.Arrays;

public class RemovieDuplicatesIntegerArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,1,1,5,4,5,3,5};
		
		Arrays.sort(a);
		
		int temp[] = new int[a.length];
		int n = 0;
		for(int i=0;i<a.length-1;i++) {
				if(a[i]!=a[i+1])
					temp[n++] = a[i];
			
				
		}temp[n++]=a[a.length-1];
		//System.out.println(Arrays.toString(a));
		//temp[n++] = a.length-1;
		for(int k=0;k<n;k++) {
			System.out.print(temp[k]);
		}
		
	}
}
