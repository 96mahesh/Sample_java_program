package collections;

import java.util.*;

public class ListItaratorPratice {

	public static void main(String[] args) {
		        //ListIterator is a Interface // its ia forward direction 
				//Introduced for iterating the only List Type Of  collection objects
				//legacy classes - v1.0
				//new class =v1.2
		        //Bio direction, read and write with spl permission for Removing the elements
	            //Bio means it will action both forward and backward direction
		        //It will applicable for the legacy class and new Class in List Type Of InterFace
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(85);
		al.add(78);
		
		ListIterator<Integer> li = al.listIterator();
		
		//forward Direction
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		
		li.add(45);
		System.out.println();
		
		//backward Direction
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}

		System.out.println();
        li.remove();
        System.out.println(al);
        
        System.out.println();
        
        Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(85);
		v.add(78);
		
		ListIterator<Integer> vl = al.listIterator();
		
		//forward Direction
		while(vl.hasNext()) {
			System.out.print(vl.next()+" ");
		}
		
		vl.add(45);
		System.out.println();
		
		//backward Direction
		while(vl.hasPrevious()) {
			System.out.print(vl.previous()+" ");
		}

		System.out.println();
        vl.remove();
        System.out.println(v);
	}
}
