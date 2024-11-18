package demo;

public class StringSupparateIntiger {

	public static void main(String[] args) {
		
		String s = "Thank You for Submitting the Protocol 0499.";
	
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				String x = String.valueOf(s.charAt(i));
				 int y = Integer.parseInt(x);
				 //System.out.print(y);
			}
			
		}
	
		subString.main();
			
		}
	}

 class subString {
	 public static void main() {
		
		 String s = "Thank You for Submitting the Protocol 10499.";
		 String name = s.substring(s.length()-5, s.length()-1);
		 //System.out.println(name.length());
		 //System.out.println(name);
		 int num =  Integer.parseInt(name);
		 System.out.println(num);
		
	}
	 
 }
