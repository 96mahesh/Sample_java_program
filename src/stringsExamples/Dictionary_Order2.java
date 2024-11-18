package stringsExamples;

public class Dictionary_Order2 {

	public static void main(String[] args) {  
	      String[] name = { "John","Remo","Mixy","Julie","Ronny"};  
	     String temp ="";
	      for(int i=0;i<name.length;i++) {
	    	  for(int j=0;j<name.length;j++) {
	    		  if(name[i].compareTo(name[j])<0) {
	    			      temp = name[i];
	    			      name[i] = name[j];
	    			      name[j] = temp;    			  
	    		  }
	    	  }    		  
	      }
	      
	      for(int i=0;i<name.length;i++) {
	    	  System.out.println(name[i]);
	      }
	   }  
	}  
	


