package demo;

import java.util.Arrays;
import java.util.Collections;

public class SortOfArray {

	public static void main(String[] args) {
		int a[] = {30,50,20,10,60};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		ParallelSort.sort();
		System.out.println("==================");
		CollectionSort.main();
		System.out.println("==================");
		assindingorder.assindingsort();
		System.out.println("\n ==================");
		Dessindingorder.dessindinggsort();
	}
}
class ParallelSort {
	public static void sort() {
		int a[] = {30,50,20,10,60};
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}
}

class CollectionSort {
	public static void main() {
		Integer a[] = {30,50,20,10,60};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}

class assindingorder{
	
	public static void assindingsort() {
		int a[] = {30,50,20,10,60};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
				int temp = a[j];
				    a[j] = a[j+1];
				    a[j+1] = temp;
				}
				 
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

class Dessindingorder{
	
	public static void dessindinggsort() {
		int a[] = {30,50,20,10,60};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
				int temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
				}
				 
			}
		}
		System.out.println(Arrays.toString(a));
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
