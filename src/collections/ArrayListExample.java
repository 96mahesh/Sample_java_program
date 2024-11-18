package collections;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Mahesh");
		al.add("Pawan");
		al.add("kalyan");
		al.add("Ram");
		al.add("Mahesh");
		al.add("Pawan");
		al.add("kalyan");
		al.add("Ram");
		al.add("Ramarao");
		al.add(0,"Jyothi");
		
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(0));
//		for (String string : al) {
//			System.out.println(string);
//		}
	}
}
