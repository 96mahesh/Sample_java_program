package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindHightMarks_Collections {

public static void main(String[] args) {
		
		Map<String, Integer> marks = new HashMap<String,Integer>();
		marks.put("Mahesh", 90);
		marks.put("Paparao", 95);
		marks.put("Dinesh", 80);
		marks.put("Samreen", 85);
		marks.put("Prasad", 89);
		
		Iterator<String> it = marks.keySet().iterator();
		String pk =  it.next().toString();
		System.out.println(pk);
		int mr =  (int) marks.get(pk);
		System.out.println(mr);
		
		while(it.hasNext()) {
			String temp1 = it.next().toString();
			int temp2 = (int) marks.get(temp1);
			if(mr>temp2) {
				pk=temp1;
				mr=temp2;
			}
		}
}
}
