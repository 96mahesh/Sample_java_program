package ArraysExample;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		 
        int[] a = { 10, 20, 30, 40 }; 
        int[] b = { 50, 60, 70, 80 }; 
        int a1 = a.length;  
        int b1 = b.length; 
        int c1 = a1 + b1;  
        int[] c = new int[c1];  
        System.arraycopy(a, 0, c, 0, a1); 
        System.arraycopy(b, 0, c, a1, b1); 
        System.out.println(Arrays.toString(c));
        
        MergeStringArray.main();
		
//        int a[] = { 30, 25, 40 }; 
//        int b[] = { 45, 50, 55, 60, 65 }; 
	}
}
 class MergeStringArray{
	 public static void main() {
		String a[] = {"chai","coffe"} , b[] = {"milk","water","cock"};
        int a1 = a.length; 
        int b1 = b.length;  
        int c1 = a1 + b1; 
        String[] c = new String[c1]; 
        int p=0;
        for (int i = 0; i < a1; i = i + 1) { 
            c[p++] = a[i]; 
        }  
        for (int i = 0; i < b1; i = i + 1) { 
            c[p++] = b[i]; 
        } 
        System.out.print(Arrays.toString(c)+"\n");
        
        for(int i=0;i<p;i++) {
        	System.out.print(c[i]+" ");
        }
	}

	}
	
		
	

//
//String c[] ="";
// for(int i=0;i<a.length;i++) {
//	 for(int j=0;j<b.length;j++) {
//		 if(a[i]!=b[j]) {
//			 c=a[i]+b[j];
//		 }
//         System.out.print(c+" ");
//	 }
// }