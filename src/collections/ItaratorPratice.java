package collections;

import java.util.*;
import java.util.Iterator;

public class ItaratorPratice {

	public static void main(String[] args) {
		        //Iterator is a Interface // its ia forward direction 
				//Introduced for iterating the all collection objects
				//legacy classes - v1.0
				//new class =v1.2
		        //One direction, read_only with spl permission for Removing the elements
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(85);
		al.add(78);
		
		Iterator<Integer> i =al.iterator();
		//i.hasNext();
		//i.next();
		
//		while(i.hasNext()) {
//			i.next();
//			i.remove();
//			//System.out.println(i.next());
//		}
		i.next();
		i.remove();
		
		i.next();
		i.remove();
		
		System.out.println(al);
		
		
		HashMap<String , Integer> mp = new HashMap<>();
		mp.put("india", 500);
		mp.put("Sri lanks", 600);
		mp.put("Londan", 1000);
		
		mp.keySet().iterator();
		mp.values().iterator();
		mp.entrySet().iterator();
		
		System.out.println(mp);
	}
}
