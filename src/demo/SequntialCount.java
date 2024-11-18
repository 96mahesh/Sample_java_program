package demo;

public class SequntialCount {
	
	public static void main(String[] args) {
		//input a2b3c4a1b1c1;
		//output aabbbccccabc;
		
		String str = "a1b2c3";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				System.out.println(str.charAt(i));
			}
			
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				char a  = str.charAt(i);
				
				String x = String.valueOf(a);
				//System.out.println(x);
				int num = Integer.parseInt(x);
				//System.out.println(num);
				
				for(int j=1;j<=num ; j++) {
					System.out.println(str.charAt(i-1));
				}
			}
			
		}
		
	}
	
			
}
