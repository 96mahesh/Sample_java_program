package demo;

public class Max_Min_Number {

	public static void main(String[] args) {
		
		int a[] = {10,60,20,40,30,50};
		
		int max =  a[0];
		int max1 = a[0];
		int min =  a[0];
		int min1 = a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
		    max1 = max;
			max = a[i];
			
			}
			else if(max<a[i]) {
				max = a[i];
			}
			
			if(min>a[i]) {
				min1 = min;
				min = a[i];
			}
			else if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println(max1+" "+min1);		
		
	}
}
