
package demo;

public class SubStringPattren {

	public static void main(String[] args) {
		
		String name = "samreen".toUpperCase();
		
		char a[] = name.toCharArray();
		
		for(int i=0;i<a.length;i++) {			
			for(int j=0;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
				System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
		
//		for(int i=0;i<a.length;i++) {			
//			for(int j=0;j<=i;j++) {
//				System.out.print(a[j]+" ");
//				}
//				System.out.println();
//			}
		
	}
}
