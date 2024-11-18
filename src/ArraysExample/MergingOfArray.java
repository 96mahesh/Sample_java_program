package ArraysExample;

import java.util.Arrays;

public class MergingOfArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};
		int b[] = {50,60,70,80};
		
		int a1 = a.length; //4
		int b1 = b.length; //4
		int c1 = a1+b1; //8
		int c[] = new int[c1] , p = 0;
		
		for(int i=0;i<a.length;i++) {
			c[p++] = a[i]; //{10,20,30,40,0,0,0,0}
		}
		
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<b.length;i++) {
			c[p++] = b[i]; //{10,20,30,40,50,60,70,80}
		}
		
		System.out.println(Arrays.toString(c));
		
		for (int i : c) {
			System.out.print(i+" ");
		}
	}
}
