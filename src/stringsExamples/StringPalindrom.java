package stringsExamples;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String name = "madam";
		String rev = "";
		char a[] = name.toCharArray();
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
			System.out.println("is palindrome");
		}
		else
			System.out.println("Is not a pallindrom");
		
		}
	}

