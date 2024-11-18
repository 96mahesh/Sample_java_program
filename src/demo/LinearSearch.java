package demo;

public class LinearSearch {

	public static void main(String[] args) {
		
		boolean status = false;
		int a[] = {10,20,40,50,30};
		int search_ele = 100;
		
		for(int i=0;i<a.length;i++) {
			if(search_ele==a[i]) {
				System.out.println("Element is found at :"+i);
				status = true;
				break;
			}
		}
		
		if(status == false)
			System.out.println("Element is notfound at :");
	}
}
