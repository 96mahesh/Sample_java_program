
package demo;

import java.util.Scanner;

public class GetSmallestAndLargest {

	//input = welcometojava  3  //output ava wel
	public static String getSmallestAndLargest(String s , int k) {	
		
		 
		 String min = s.substring(0,k);
		 String max = s.substring(0,k);
		
		 for(int i=0;i<s.length()-k+1;i++) {
		   String  sub =  s.substring(i, i+k);
			//System.out.println(sub);

			if(sub.compareTo(min)<0) {
				 min = sub;
			}
			if(sub.compareTo(max)>0) {
				 max = sub;
			}
		 }
		 System.out.println(min);
		 System.out.println(max);
		return min+max;
		

		
	}
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Value");
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
//	      //  System.out.println(getSmallestAndLargest(s, k));
	         getSmallestAndLargest(s ,k);
	      
	}
	
//	 public static String getSmallestAndLargest(String s, int k)
//	    {
//	        // Initialize min and max as first substring of size k
//	        String currStr = s.substring(0, k);
//	        String lexMin = currStr;
//	        String lexMax = currStr;
//	  
//	        // Consider all remaining substrings. We consider
//	        // every substring ending with index i.
//	        for (int i = k; i < s.length(); i++) {
//	            currStr = currStr.substring(1, k) + s.charAt(i);
//	            if (lexMax.compareTo(currStr) < 0)     
//	                 lexMax = currStr;
//	            if (lexMin.compareTo(currStr) > 0)
//	                 lexMin = currStr;            
//	        }
//	 
//	        // Print result.
//	        System.out.println(lexMin);
//	        System.out.println(lexMax);
//			return lexMax;
//	    }
//	 
//	    // Driver Code
//	    public static void main(String[] args)
//	    {
//	        String str = "welcometojava";
//	        int k = 3;
//	        getSmallestAndLargest(str, k);
//	    }
}
