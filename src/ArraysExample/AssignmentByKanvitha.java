package ArraysExample;

import java.util.Arrays;

public class AssignmentByKanvitha {
	
	public static void main(String[] args) {

		String name = "india   is     my   cuntry";
		
		char a[] = name.toCharArray();
		String res = "";
		String u[] = new String[4];
		int s = 0;
		int k = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z') {
				res = res+a[i];
			}
			else {
				if(a[i-1]>='a' && a[i+1]<='z')
					res = res+" ";	
			}
		}
	
		String val = "";
	    for(int i=0;i<res.length();i++) {
	    	val = val+res.charAt(i);
	    	 if(i+1 == a.length) {
			    	k = i+1;
			    	u[s++] = val;
			    	break;
			    }
	    	 else if(res.charAt(i)<=' ') {
	    		     k = i+1;
		    		u[s++] = val;
		    		val = " ";
		    	}
	    }
	    System.out.println(k);
	    System.out.println(Arrays.toString(u));
	    System.out.println(val);
		System.out.println(res);
//		System.out.println();
//		StringConverWord.main(args);
	}

	}

class StringConverWord{
	public static void main(String[] args) {
		String s = "india is my country ";
		int u = 4;
		int k=0;
 
		String[] a = new String[u];
 
		String res = "";
		for (int i = 0; i < s.length()-1; i++) {
			res = res + s.charAt(i);
            if (s.charAt(i) == ' ') {
				System.out.println(res);
 
				     
					a[k++] = res;
					res="";
 
					
				}
 
			}	
		System.out.println(Arrays.toString(a));
	}
 
}

