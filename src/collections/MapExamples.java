package collections;

import java.util.*;
import java.util.Map.Entry;

public class MapExamples {
    public static void main(String[] args) {
    	
    	//Creation of a map
		//Map<Integer,String> mp = new Hashtable<>();
		//Map<Integer,String> mp = new HashMap<>();
		//Map<Integer,String> mp = new TreeMap<>();
    	Map<Integer,String> mp = new LinkedHashMap<>();

		
    	//Addition of Element Of map
		
		mp.put(500018, "Hyderabad");
		mp.put(603103, "Chennai");
		mp.put(500032, "Delhi");
		System.out.println(mp.size());
		//Retrival of keys from the map
		Set<Integer> keys = mp.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		System.out.println();
		//Retrival of value from the map
		Collection<String> val = mp.values();
		for (String v : val) {
			System.out.println(v);
		}
		
		System.out.println();
		//Retrival of value from the map based on a key
		System.out.println(mp.get(500018));
		
		System.out.println();
		for (Integer key : keys) {
			System.out.println(key+">>>>>>>>>>>>>"+mp.get(key));
		}
		
		System.out.println();
		
		System.out.println(mp);
		//Delete of Element from the map
		//mp.remove(500032);
		mp.remove(500032,"Delhi");
		System.out.println(mp);
		
		System.out.println();
		//verification element of key from the map
		
		System.out.println(mp.containsKey(500018));
		System.out.println(mp.containsKey(500019));
		
		System.out.println();
		//verification element of value from the map
		
		System.out.println(mp.containsValue("Hyderabad"));
		System.out.println(mp.containsValue("SecundraBad"));
		
		System.out.println();
		
		//updation of element from the map
		
		System.out.println(mp);
		mp.put(500032, "S R Nagar");
		System.out.println(mp);
		
		System.out.println();
		
		System.err.println(mp);
		mp.putIfAbsent(500018, "Hyderabad");
		System.err.println(mp);
		
		System.out.println();
		System.err.println(mp);
		mp.putIfAbsent(523312, "Srikakulam");
		System.err.println(mp);
		
		System.out.println();
		System.out.println(mp);
		mp.replace(603103, "Taminadu");
		System.out.println(mp);
		
		//find the size of map
		
		System.out.println();
		System.out.println(mp.size());
		
		System.out.println();
//		mp.clear();
//		System.out.println(mp);
		
		//getting elements
		Set<Entry<Integer , String >> entries = mp.entrySet();
		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"......"+value);
		}
		
		
		
	}
}
  
