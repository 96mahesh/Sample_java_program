package collections;

import java.util.*;

public class SetExamples {

	public static void main(String[] args) {

		// set is a data Structure which is only Stores the unique Data Does not allow,
		// Duplicate Data
		// HashSet
		// HashSet Stored internal HashMap ==> Array of nodes(key , value);

		// Iterable<String> s = new HashSet<>();
		// HashSet<Integer> hs = new HashSet<>();

		// creation of Set
		HashSet<Integer> hs = new HashSet<>();

		// Adding value of data
		hs.add(10);
		hs.add(2);
		hs.add(85);
		hs.add(65);
		hs.add(5);
		hs.add(75);
		hs.add(95);
		hs.add(2);

		// Remove of Data
		System.out.println(hs);
		System.out.println(hs.remove(85));
		System.out.println(hs);

		// verification

		System.out.println(hs.contains(75));

		// Retrival

		for (Integer i : hs) {
			System.out.println(i);
		}

		// Linked Hash Set

		// LinkedHashSet will maintain the Order
		// LinkedHashMap Internal Implementation LinkedHashMap
		System.err.println("=============================");
		System.err.println("Execute Linked HashSet");
		System.err.println("=============================");

		LinkedHashSet<Integer> Lhs = new LinkedHashSet<>();

		Lhs.add(10);
		Lhs.add(2);
		Lhs.add(85);
		Lhs.add(65);
		Lhs.add(5);
		Lhs.add(75);
		Lhs.add(95);
		Lhs.add(2);

		// Remove of Data
		System.out.println(Lhs);
		System.out.println(Lhs.remove(85));
		System.out.println(Lhs);

		// verification

		System.out.println(Lhs.contains(75));

		// Retrival

		for (Integer i : Lhs) {
			System.out.println(i);
		}

		System.out.println(Lhs.isEmpty());
		System.out.println(Lhs.size());
//        Lhs.clear();
//        System.out.println(Lhs);

		System.err.println("=============================");
		System.err.println("Execute TreeSet HashSet");
		System.err.println("=============================");
		
		//TreeSet internal implimentation treemap ====>Binary tree
		//it will stored shroted order

		TreeSet<Integer> t = new TreeSet<>();

		t.add(10);
		t.add(2);
		t.add(85);
		t.add(65);
		t.add(5);
		t.add(75);
		t.add(95);
		t.add(2);

		// Remove of Data
		System.out.println(t);
		System.out.println(t.remove(85));
		System.out.println(t);

		// verification

		System.out.println(t.contains(75));

		//Identify lowest element Hieght Element
		System.out.println(t.first());
		System.out.println(t.last());
		
		System.out.println();
		//Remove  frist last letter
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.pollLast());
		System.out.println(t);
		
		//SubSet between range
		System.out.println(t.subSet(4, 65));
		System.out.println(t.subSet(4, 65).remove(5));
		System.out.println(t);
		
		System.out.println(t.descendingSet());
		// Retrival

//		for (Integer i : t) {
//			System.out.println(i);
//		}

	}
}
