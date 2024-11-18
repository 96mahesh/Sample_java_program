package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConSecutive_numbers {

	public static void main(String[] args) {
		int a[] = {2, 6, 6, 6, 6, 5, 4, 6, 6, 8, 4, 6, 6, 6, 2, 6};
		int k = 6;
		int n = 3;
		List <int[]> res = new ArrayList<>();
		int s = 0, e = 0;
		int prev = 1;
		
		for(int i=0;i<a.length;i++)	{
			int x  = a[i];
			if(x == k) {
				s = i;
				if(prev!=k) {
					e = i;
				}
			}
			else {
				if(prev == k && e -s+1 >=n) {
					res.add(new int[] {s,e});
				}
			}
			prev  = x;
		}
		
		for (int[] x : res) {
			System.out.println(Arrays.toString(x));
		}
}
}
