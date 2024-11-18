
public class CallByReffrence {

//	int a , b ;
//	
//	private static void add(CallByReffrence op , CallByReffrence op1) {
//		
//		op.a = 10;
//		
//		System.out.println("Result from Method :" +(op.a+op.b));
//	}
	
	int a=20;
	
	void sum(CallByReffrence c)
	{
		a=100+c.a;
	}
	
	void sum(int c)
	{
		this.a=100+c;
	}
	
	public static void main(String[] args) {

		CallByReffrence obj= new CallByReffrence();
		
		System.out.println("Before Passing Value ::: "+obj.a);
		obj.sum(50);
		System.out.println("Before Passing Value ::: "+obj.a);

	
	}
}
