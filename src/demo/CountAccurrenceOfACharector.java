package demo;

public class CountAccurrenceOfACharector {
   public static void main(String[] args) {
	
	   String name = "mahesh babu rampatruni";
	   String str = "a";
	   
//	  int total_length =  name.length();
//	  int final_length = name.replace("a", "").length();
//	  int count = total_length - final_length;
//	  System.out.println(count);
	   
	   char a[] = name.toCharArray();
	   char b[] = str.toCharArray();
	   int count = 0;
	   
	   for(int i=0;i<a.length;i++) {
		   for(int j=0;j<b.length;j++) {
			   if(a[i]==b[j])
				   count++;
		   }
	   }
	   System.out.println(count);
}
}
