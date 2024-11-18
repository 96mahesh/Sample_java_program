package demo;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		 
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		boolean flag = false;
		
		int keys = 3;
		int l = 0;
		int h = a.length-1;
		
		while(l<=h) {
			
			int m = (l+h)/2;
			if(a[m]==keys) {
				System.out.println("Element is found : ");
				flag = true;
				break;
			}
			
			if(a[m]<keys) {
				l=m+1;
			}
			if(a[m]>keys) {
				h=m-1;
			}
			
		}
		if(flag==false) {
			System.out.println("Elemenet is not found");
		}
		//BinarySearchElement.main();
		
		
	}
}

class BinarySearchElement{
	public static void main() {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.binarySearch(a, 2));
	}
}

