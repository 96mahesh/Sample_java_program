package demo;

public class StringFristLetterUpperCase {

	public static void main(String[] args) {
		
		String name = "mahesh babu rampatruni";
		String a[] = name.split(" ");
		String n =" ";
		for (String x : a) {
			String y = x.substring(0,1);
			String z = x.substring(1);
			n=n+y.toUpperCase()+z+" ";
			
		}
		System.out.println(n);
	}
}
