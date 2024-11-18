package collections;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.add("red");
		st.add("English");
		st.add("telugu");
		st.add(0,"Hindhi");
		st.remove(0);
		st.set(0, "Match");
		//st.clear();
		System.out.println(st.contains("telugu"));
		System.out.println(st);
		
		Stack<String> st1 = new Stack<String>();
		st1.push("mahesh");
		st1.push("Ram");
		st1.push("Pawan");
		st1.push("Kalyan");
		st1.push("Charan");
		st1.push("Tej");
		
		System.out.println(st1);
		System.out.println(st1.peek());
		//System.out.println(st1.pop());
		System.out.println(st1.search("mahesh"));
		System.out.println(st1.indexOf("mahesh"));
		System.out.println(st1);
		

	}
}
