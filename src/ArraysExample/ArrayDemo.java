package ArraysExample;

public class ArrayDemo {
	public static void main(String[] args) {
		
//		int a[] = {10,20,30,40,50};
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
//		}
//		
	
		ReverseOfArray.main();

}
}

class ReverseOfArray{
	public static void main() {
		
		String a[] = {"true","false","false","true","false","true"};
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}
}
