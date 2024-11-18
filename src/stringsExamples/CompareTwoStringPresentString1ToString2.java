package stringsExamples;

public class CompareTwoStringPresentString1ToString2 {

	public static void main(String[] args) {
		
		String str1 = "New York";
		String str2 = "NWYR";
		
		String res = "";
		for(int i=0;i<str1.length();i++) {
			char temp = str1.toLowerCase().charAt(i);
			if(str2.toLowerCase().indexOf(temp)>=0)
				res += str1.charAt(i);
			else
				res += '+';
		}
		System.out.println(res);
		StringCompares.main();
	}
}

class StringCompares{
	
	public static void main() {
		String str1 = "New York";
		String str2 = "NWYR";
		
		String res = "";
		
		for(int i=0;i<str1.length();i++) {
			char a = str1.toLowerCase().charAt(i);
				if(str2.toLowerCase().indexOf(a)>=0)
					res = res+str1.charAt(i);
				else
					res = res+'+';
			
		}
		System.out.println(res);
	}
}