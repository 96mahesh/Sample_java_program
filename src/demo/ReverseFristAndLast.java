package demo;

import java.util.Arrays;

public class ReverseFristAndLast {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		System.out.println("Before Revesre of Array :"+Arrays.toString(a));
		int b = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = b;
		System.out.println("After Revesre of Array :"+Arrays.toString(a));
		
		FrostLastReverWord.main();
	}
	
class FrostLastReverWord{
	public static void main() {
		
		String name = "Mahesh";
		char a[] = name.toCharArray();
		System.out.println("Before Revesre of Array :"+Arrays.toString(a));
		char b = a[0];
		a[0] = a[a.length-1];
		a[a.length-1] = b;
		System.out.println("After Revesre of Array :"+Arrays.toString(a));
	
	}
}
}
