package collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		
		//creating List 
		
		Vector<String> v1 = new Vector<String>();
		
		//Adding Elements of List
         v1.add("mahesh");
         v1.add("pawan");
         v1.add("Ram");
         v1.add("Ramarao");
         v1.add("Jyothi");
         v1.add("Dinesh");
         v1.add("Kavya");
         v1.add("Bharathi");
         v1.add("Vaikunta");
         v1.add(4,"Reddy");
         v1.add("Papa");
         
         
         Vector<String> v2 = new Vector<String>();
         v2.add("suresh");
         v2.add("Ramesh");
         System.out.println(v2);
//         
         Vector<String> v3 = new Vector<>();
         v2.add("Ramesh");
         v2.add("suresh");
         System.out.println(v3);
//         for(int i=0;i<v2.size();i++) {
//        	v1.add(v2.get(i));
//         }
//         
 //          v1.add(v2.indexOf(0));
         v1.addAll(1,v2);
//         
//         //Retrival ofElement
         Object x = v1.get(6);
         Object y = v1.indexOf(x);
         System.err.println(y);
        
        //Delete Of Element      
//      System.out.println(v1.remove(0));
//       System.out.println(v1.remove("Reddy"));
//      System.out.println(v1.removeAll(v2));
       //v1.clear();
//       
//         //
        //verification
//        
//          System.out.println(v1.contains(v2.get(1)));
//          System.out.println(v1.containsAll(v2));
//          System.out.println(v1.contains("mahesh"));
//          System.out.println(v1.containsAll(v3));
//        //updation
//        System.out.println("==============");
//        //System.out.println(v1.get(1));
//        System.out.println(v1.set(0, "Viswa"));
//        System.out.println(v1.containsAll(v3));
        
//        
         System.out.println(v1);
         System.out.println(v1.size());
         System.out.println(v1.capacity());
         System.err.println(x);
//
//         System.out.println("++++++++++++");
//         
//         Object obj[] = v1.toArray();
//		System.out.println(Arrays.toString(obj));
//		
		 int a[] =new int[] {1,2,3,4,5};		  
		 Vector<Object> v = new Vector<Object>(Arrays.asList(a));
		 System.out.println(v);
		 
		 v.add("Yadagiri");
		 Object sum = 0;
		 for(int i=0;i<v.size();i++) {
			  sum =  v.get(i);
//		 }
			 
	}
	
	}	
}
