package demo;

public class NumberAssinding_Substraction {
  public static void main(String[] args) {
	
	  int n = 817; 
	  String str = String.valueOf(n);
	  char a[] = str.toCharArray();
	  
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<a.length;j++) {
			  if(a[i]>a[j]) {
			  char temp = a[i];
			       a[i] = a[j];
			       a[j] = temp;
			  }
		  }
	  }
	  for (char c : a) {
		System.out.println(c);
	}
	  
	  int sub = 0;
	  
	  for(int i=1;i<1;i++) {
		  String s = String.valueOf(a[i]);
		  int temp = Integer.parseInt(s);
		  sub = temp;
	  
	  
	  for(int j=1;j<a.length;j++) {
		  String s1 = String.valueOf(a[j]);
		  int temp1 = Integer.parseInt(s1);
		  sub = sub-temp1;
	  }
	  }
	  System.out.println(sub);
	  
}
}
