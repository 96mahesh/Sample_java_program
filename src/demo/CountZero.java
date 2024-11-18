package demo;

public class CountZero {

	public static void main(String[] args) {
		
		//int n = 
		String a ="10204050";
		System.out.println(a);
		int count = 0;
		for(int i=0;i<a.length();i++){
			count = 0;
			for(int j=0;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j))
					count++;
			}
		}
		
		System.out.println(count);
	}
}
