package demo;

public class fibinociiSeries {

     public static void main(String[] args) {
		
    	 int max = 10;
    	 int a = 0 , b = 1,c;
    	 System.out.println(a+" "+b);
    	 do {
    		 c = a+b;
    		 if(c>max) {
    			 break;
    		 }
    			 System.out.println(c);
    			 a=b;
    			 b=c;
    		 
    		 
    	 }while(c<=max);
	}
}
