

package demo;

public class ArrayExp {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i]);
//		}
			
		
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			int temp = a[i];
			System.out.print(temp);
			    a[i] = a[j];
			    //System.out.print(a[i]);
			    a[j] = temp;
			    //System.out.print(a[j]);
		}  
		for (int i : a) {
			
			
			System.out.println(i);
		}
	} 
	
}
