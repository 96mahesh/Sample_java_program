package demo;

public class PrintIndvidualChar {

	public static void main(String[] args) {
		
		String name = "1ab23$#@km4";
		
		char a[] = name.toCharArray();
		char alp[] = new char[a.length],u=0;
		char num[] = new char[a.length],n=0;
		char spl[] = new char[a.length],s=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>='a' && a[i]<='z')
				alp[u++] = a[i];
			
			else if(a[i]>='0' && a[i]<='9')
				num[n++] = a[i];
			
			else
				spl[s++] = a[i];
		}
		
		for (int i = 0; i < u; i++) {
			System.out.print(alp[i]);
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		for (int i = 0; i < s; i++) {
			System.out.print(spl[i]);
		}
	}
}
