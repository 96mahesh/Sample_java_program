package demo;

import java.util.*;
import java.util.Map.Entry;
public class Collections {

	public static void main(String[] args) {

	  Map<String, Integer> mp = new HashMap<String, Integer>();
//	  Map<String , Integer> mp1 = new Hashtable<String , Integer>();
//	  Map<String , Integer> mp2 = new TreeMap<String , Integer>();
//	  Map<String , Integer> mp3 = new LinkedHashMap<String , Integer>();

		mp.put("Mahesh", 97);
		mp.put("Paparao", 90);
		mp.put("Dinesh", 89);
		mp.put("Kavya", 95);
		mp.put("Ramarao", 94);
		mp.put("Prasad", 88);
		
		Collection<Integer> onlymarks = mp.values();
		System.out.println(onlymarks);
		Set<String> key = mp.keySet();
		System.out.println(key);
		
		ArrayList<Integer> al = new ArrayList<>();
		for (Integer in : onlymarks) {
			al.add(in);
		}
		
		System.out.println(al);
		
		java.util.Collections.sort(al);
		int Hm = al.get(al.size()-1);
		System.out.println(Hm);
		
		Set<Entry<String , Integer>> entry = mp.entrySet();
		System.out.println(entry);
		for (Entry<String, Integer> e : entry) {
			if(e.getValue()==Hm)
				System.out.println("Hight Keys : "+e.getKey()+"\n Hight value :"+e.getValue());
		}

		
	}

	
}
