
public class CallByValue {

	int a,  b;
	
	private static void add(int s , int t) {
		
		s = 10;
		System.err.println("Result from method : " + (s+t));
	}
	
	public static void main(String[] args) {
		
		CallByValue obj = new CallByValue();
		obj.a = 2 ; obj.b = 3;
		System.out.println("before passing :"+ (obj.a+obj.b));
		add(obj.a,obj.b
				);
		System.out.println("After passing :"+ (obj.a+obj.b));
		
	}
}
