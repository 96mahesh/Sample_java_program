package collections;

import java.util.Arrays;

public class ReverseOfString {

	public static void main(String[] args) {
		 String name = "divya";
		 char a[] = name.toCharArray();
		 System.out.println(Arrays.toString(a));
		 
		 for(int i=a.length-1;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
		 
	}
}
