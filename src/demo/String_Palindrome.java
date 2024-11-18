package demo;

public class String_Palindrome {

	public static void main(String[] args) {
		String name = "JavaJ";
		char a[] = name.toCharArray();
		
		String rev = "";
		for(int i=a.length-1;i>=0;i--) {
			rev = rev+a[i];
		}
		System.out.println(rev);
		if(rev.equals(name)) {
			System.out.println("This String is palindrome");
		}
		else {
			System.out.println("This String is Not palindrome");
		}
		
		reverseString.main();
		stringReverse.revString();
		
	}

}
class reverseString{
	
	public static void main() {
		
		String name = "Mahesh";
		char a[] = name.toCharArray();
		
		String rev="";
		
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--) {
			char temp = a[i];
			     a[i] = a[j];
			     a[j] = temp;
		}
		
		for (char c : a) {
			rev = rev+c;
		}
		
		System.out.println(rev);
		if(rev.equals(name)) {
			System.out.println("This String is palindrome");
		}
		else {
			System.out.println("This String is Not palindrome");
		}
	}
}

class stringReverse{
	public static void revString() {
		String name = "JavaJ";
		
		String rev = "";
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(name)) {
			System.out.println("This String is palindrome");
		}
		else {
			System.out.println("This String is Not palindrome");
		}
		
		reverseString.main();
		
	}
	}

