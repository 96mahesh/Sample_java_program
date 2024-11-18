package demo;

public class PrintOddNumbers {

	public static void main(String[] args) {
		
		int a[] = {2,4,5,8,17,3,20,7,6,9,14,88,11};   // 17,7,11
		
		int count=0;
		for(int i=1;i<a.length;i++) {	
			if(a[i]%2==1) {
				count++;
				if(count%2==0)
			System.out.println(a[i]);		
		}

	}
}
}

