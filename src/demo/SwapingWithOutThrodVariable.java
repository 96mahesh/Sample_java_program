package demo;

public class SwapingWithOutThrodVariable {

	public static void main(String[] args) {

		String a = "mahesh";
		String b = "pawan";

		System.out.println("Before Swaping " + a + " " + b);
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("Afetr Swaping " + a + " " + b);
		SwapingWithOutThrodVariable.main();
	}

	public static void main() {

		String a = "mahesh";
		String b = "pawan";

		System.out.println("Before Swaping " + a + " " + b);
		String c = a;
		       a = b;
		       b = c;
		System.out.println("Before Swaping " + a + " " + b);
	}
}
