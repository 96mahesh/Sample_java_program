package demo;

public class SumOfSum {

	public static void main(String[] args) {
		
		int n = 2345;
		
		String str = String.valueOf(n);
		char a[] = str.toCharArray();
		int sum  = 0;
		
		for(int i=0;i<a.length;i++) {
		char ch =  a[i];
		String x = String.valueOf(ch);
		sum = sum+Integer.parseInt(x);
		}
		System.out.println(sum);
		
		int b = sum;
		String newstr = Integer.toString(b);
		
		char c[] = newstr.toCharArray();
		int s = 0;
		for(int i=0;i<c.length;i++) {
			char k = a[i];
			String l = String.valueOf(k);
			s = s+Integer.parseInt(l);
			
		}
		
		System.out.println(s);
	}
}
