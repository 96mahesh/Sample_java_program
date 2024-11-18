package demo;

import java.util.ArrayList;
import java.util.List;

public class TaskByKanvitha {
	public static void main(String[] args) {
    int a[] = {10,20,30,40,50}; //[160, 170, 180, 190, 200]
    int sum = 0;
    List<Integer> ls = new ArrayList<>();
    for(int i=0;i<a.length;i++) {
    	sum = sum+a[i];
    			
    }
    System.out.println(sum);
    for (int i : a) {
    	ls.add(i+sum);
		
	}
    System.out.print(ls);
	}
}
