package stringsExamples;

import java.util.Arrays;

public class TaskBykanvitha {

	public static void main(String[] args) {
		
		String str = "india is my country";
		char a[] = str.toCharArray();
		
		String s[] = new String[4];
		int x = 0;
		int k = 0;
		
		for(int i=k;i<a.length;i=k) {
			String temp = "";
			for(int j=k;j<a.length;j++) {
				if(a[j]>='a' && a[j]<='z') {
				    temp += a[j];
				    if(j+1 == a.length) {
				    	k = j+1;
				    	s[x++] = temp;
				    	break;
				    }
				}
			else if(a[j]==' ') {
				s[x++] = temp;
				k = j+1;
				break;
			}
			}
			
		}
		System.out.println(Arrays.toString(s));
	}
}
