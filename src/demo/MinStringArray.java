package demo;

public class MinStringArray {
      public static void main(String[] args) {
    	  String a[] = {"coffe","chai","water","Dait Cocke"};
    	  String value = a[0];
    	  int x = 0;
    	  String min = "";
    	  int j = 0;
    	    for(int i=0;i<a.length;i++) {
    	    	if(a[i].length()<value.length()) {
    	    		x = a[i].length();
    	    		min = a[i];
    	    		j = i;
    	    	}
    	    }
    	    System.out.println(min+" "+x+" "+j);
	}	
}
