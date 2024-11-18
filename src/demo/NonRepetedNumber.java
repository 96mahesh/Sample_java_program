package demo;

public class NonRepetedNumber {

	public static void main(String[] args) {
		 
		String name = "paparao";
		char a[] = name.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			int count = 0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j])
					count++;		
			}
			
			if(count==1) {
				System.out.println(a[i]);
				break;
			
			}
		}
	}
}
