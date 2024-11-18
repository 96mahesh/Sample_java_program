package selenium;

public class Swapping {
public static void main(String[] args) {     
	
	String a="Mahesh";
	String b="pawan";
	System.out.println("Before Swapping: "+a+" vs "+b);
	a=a+b;
	b = a.substring(0, a.length()-b.length());
	a = a.substring(b.length());
	System.out.println("After Swapping: "+a+" vs "+b);
	}
}

/*
 * a = a+b = 10+20=30
 * b = a-b = 30-20=10
 * a = a-b = 10-30 = 20
 */
