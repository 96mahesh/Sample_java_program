package demo;

public class Print1_100Numbers {

	static void p(int i) {
		if(i<=100) {
			System.out.println(i);
			i++;
			p(i);	
		}
	}
	public static void main() {
		p(1);
	}
}
