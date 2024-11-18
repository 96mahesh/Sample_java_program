package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemovieDuplicates {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,1,1,5,4,5,3,5};
//		Map<Integer,Integer> map = new HashMap<>();
//		 for(int i=0;i<a.length;i++) {
//			 map.put(a[i], 1);
//		 }System.out.println(map.keySet());
		
		Map<Integer,Integer> map = new HashMap<>();
		
		 for(int i=0;i<a.length;i++) {
			 if(map.containsKey(a[i])) {
				 int count = map.get(a[i]);
				 map.put(a[i], count+1);
			 }else {
				 map.put(a[i], 1);
			 }
		 }System.out.println(map);
		 RemovieduplicatesList.main();
	}
}

class RemovieduplicatesList{
	
	public static void main() {
		
		int a[] = {1,2,3,1,1,5,4,5,3,5};
		
		List<Integer> al = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
		al.add(a[i]);
		}
		
		Set<Integer> s = new HashSet<Integer>(al);
		System.out.println(s);
	}
}
