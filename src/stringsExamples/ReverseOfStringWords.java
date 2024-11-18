package stringsExamples;

public class ReverseOfStringWords {

public static void main(String[] args) {
		
		String name = "this is a test String!!"; // THIS si a tset STRING!!
		String a[] = name.split(" ");
		
		String odd = "";
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			String reverseword = getReverseString(word);
//			if(i!=a.length-1) {
//				odd = odd+reverseword+" ";
//			}
//			else {
//				odd = odd+reverseword;
//			}
			odd  = odd+reverseword+" ";
			
		}
		System.out.println(odd);
		}
	
	private static String getReverseString(String inputString) {
		String reverseString ="";
		for(int i = inputString.length()-1; i >= 0 ;i--) {
			reverseString+= inputString.charAt(i);
		}
		return reverseString;
	}
}
