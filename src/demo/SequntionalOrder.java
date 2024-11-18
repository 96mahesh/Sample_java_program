package demo;

public class SequntionalOrder {

	public static void main(String[] args) {
		 
	    //input aabbbccccabc;
	   //output a2b3c4a1b1c1;
		
		String input = "abcabbbccaabd";
		
		char a[] = input.toCharArray();
		int count = 0;
		for(int i=0;i<a.length;i=i+count) {
			count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					count++;
				else
					break;
			}
			System.out.println(a[i]+" "+count+" ");
		}
		
	}
}
