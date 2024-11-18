package demo;

public class PairsOfNumbers {

	public static void main(String[] args) {
		
		int a[] = {-1,2,36,10,31,42,41,45};
		
		int sum = 30;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==sum)
					System.out.println(a[i]);
			}
		}
	}
}



