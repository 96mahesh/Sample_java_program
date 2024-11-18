package ArraysExample;

public class Consistent_count {

	public static void main(String[] args) {
		
		String s = "abcabbbccaabd";
		char a[] = s.toCharArray();
		int count  = 0;
		for(int i=0;i<a.length;i=i+count) {
			count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				else {
					break;
				}
				
			}
			System.out.print(a[i]+""+count);
			
		}
		
		
	
		
		
	}
}
