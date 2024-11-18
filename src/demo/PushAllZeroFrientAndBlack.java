package demo;

public class PushAllZeroFrientAndBlack {

	public static void main(String[] args) {
		
		int a[] = {1,0,2,0,3,5,0,6,0 ,8,0};
		int j = 0;
		for(int i=0;i<a.length;i++) {
				if(a[i]==0) {
					int temp = a[i];
					    a[i] = a[j];
					    a[j] = temp;
					    j++;
				}
			}
			
		
		for (int i : a) {
			System.out.print(i+" ");
		}
		
		System.out.println("=================");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp = a[i];
				    a[i] = a[j];
				    a[j] = temp;
				    j--;
			}
		}
		
	
	for (int i : a) {
		System.out.print(i+" ");
	}

	}
}
