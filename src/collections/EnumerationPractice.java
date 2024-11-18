package collections;

import java.util.Enumeration;
import java.util.*;

public class EnumerationPractice {

	public static void main(String[] args) {
		
		//Enumeration is a Interface // its ia forward direction 
		//Introduced for iterating the legacy collection objects
		//legacy classes - v1.0
		//eg = HashTable Stack Vector Dictionary and properties
		//new class =v1.2
	
		Stack<String> v = new Stack<>();
		v.add("Banana");
		v.add("Cherry");
		v.add("mango");
		v.add("Apple");
		Enumeration<String> in = v.elements();
		//in.hasMoreElements(); ====> Return boolean
		//in.nextElement();
		while(in.hasMoreElements()) {
			System.out.println(in.nextElement());
		}
		
		System.out.println();
		
		
		Hashtable<String , Integer> ages = new Hashtable<>();
		ages.put("india", 500);
		ages.put("Sri lanks", 600);
		ages.put("Londan", 1000);
		
		Enumeration<Integer> e = ages.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		System.out.println();
		Properties pro = new Properties();
		pro.setProperty("url", "localhost");
		pro.setProperty("username", "Admin");
		
		Enumeration<Object> p = pro.elements();
		while(p.hasMoreElements()) {
			System.out.println(p.nextElement());
		}
		pro.elements().asIterator();
		System.out.println(pro);
	}
}
