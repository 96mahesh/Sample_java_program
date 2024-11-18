package demo;

public class ReverseOfStrinWord {
public static void main(String[] args) {
	String name = "Automation engineer from testperform";
	String a[] = name.split(" ");
	
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	ReveseOfString.main();
}
}

class ReveseOfString{
	
	public static void main() {
		
		String name = "i a m good";
		String a[] = name.split(" ");
		String rev = "";
		for(int i=a.length-2;i>=0;i--) {
			rev = rev+a[i];
		}
		for(int i=3;i<a.length;i++) {
			String word = a[i];
			System.out.println(word);
			String revword = "";
			
			for(int j=a.length-1;j>=0;j--) {
				revword = revword+word.charAt(j);
			}
			
			rev = revword+rev;
			
			
		}
		
		System.out.println(rev);	
	}

}