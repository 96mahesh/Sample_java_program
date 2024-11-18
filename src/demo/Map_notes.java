package demo;

import java.util.HashMap;
import java.util.Map;

public class Map_notes {

	public static void decremntnotes(Map<String, Integer> map, String key, int desval) {
		
		if(map.containsKey(key)) {
			int current_value = map.get(key);
			int new_val = current_value - desval;
			map.put(key, new_val);
			System.out.println(key+" "+desval+" "+new_val);
		}
	}
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 50);
		map.put("banana", 30);
		map.put("grapes", 20);
		
		String key = "apple";
		int dec = 5;
		
		decremntnotes(map, key, dec);
		System.out.println(map);
				
		
	}
}
