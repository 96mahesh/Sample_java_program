
package demo;

public class PositionOfString {

	public static void main(String[] args) {
		
		String a = "i am in Amerpet institue";
		String b = "in";
		
		for(int i=0;i<=a.length()-b.length();i++) {
			if(a.substring(i, i+b.length()).equalsIgnoreCase(b)) {
				System.out.println(i);
			}
		}
	}
}
