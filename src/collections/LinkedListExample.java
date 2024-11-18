package collections;

import java.util.*;


public class LinkedListExample {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		ArrayList<String> al = new ArrayList<>();
        al.add("s1");
        al.add("s2");
		LinkedList<String> list = new LinkedList<>();
		list.add("y1");
		list.add("y2");
		list.add("y3");
		list.add("y2");
		list.add(null);
		list.add(1, "y4");
		list.addAll(0,al);
		//list.remove(1);
		//list.removeAll(al);
		list.set(2, "ss");

		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.contains("y1"));
		System.out.println(list.containsAll(al));
		Collections.synchronizedList(list);
		
	}
}
