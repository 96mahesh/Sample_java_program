package stringsExamples;

import java.util.Arrays;

public class StringToConvertArray {

	public static void main(String[] args) {
		
		String name = "java is super keka easy and awesome "; //["is","keka","and"] //java is super keka easy and awesome 
		String a[] = name.split(" ");
		String res[] = new String[a.length/2];
		int in = 0;
		for(int i=1;i<a.length;i++) {
			if(i%2!=0) {
			res[in] = a[i];
			in++;
			}
					}
//		System.out.println(a[5]);
//		System.out.println(a[0]);

		System.out.println(Arrays.toString(res));
		
	}
	
}
