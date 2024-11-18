import java.util.*;

public class List_Example {

	public static void main(String[] args) {
		
		List<Object> ls = new ArrayList<>();
		ls.add("Mahesh");
		ls.add("pawan");
		ls.add("Ram");
		ls.add(10);
		ls.add(50);
		String y = "";
		for(int i=0;i<=ls.size()-1;i++) {
			Object x = ls.get(i);
			y = String.valueOf(x);
			//System.out.println(y);
			
			for(int j=0;j<y.length();j++) {
				if(y.charAt(j)>='0' && y.charAt(j)<='9') {
					System.out.println(y);
					break;
				}
			}
			
		}
		
		List_exp.main(args);
	}
}

class List_exp{
	public static void main(String[] args) {
		List<Object> ls = new ArrayList<>();
		ls.add("Mahesh");
		ls.add("pawan");
		ls.add("Ram");
		for (Object obj : ls) {
			if(obj instanceof Integer)
				System.out.println(obj);
		}
	}
}
