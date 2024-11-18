
public class Print1To100 {

	
	static void print(int num)
	{
		if(num>0)
		{
			print(num-1);
			System.out.println(num);
		}
		
		//return;
	}
	public static void main(String[] args) {
		
		print(5);
		System.out.println("==========");
		PrintNumbers.main(args);

	}

class PrintNumbers{
	
	static void p(int i) {
		if(i<=5) {
			System.out.println("*");
			i++;
			p(i);	
		}
	}
	public static void main(String[] args) {
		p(1);
	}
}
}
