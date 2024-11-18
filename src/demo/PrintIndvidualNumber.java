package demo;

public class PrintIndvidualNumber {

	public static void main(String[] args) {
		
		String name = "mahesh@123";
		
		char a[] = name.toCharArray();
		
		char alp[] = new char[a.length], A=0;
		char num[] = new char[a.length] , n=0;
		char spl[] = new char[a.length], s=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z')
				alp[A++] = a[i];
			else if (a[i]>='0' && a[i]<='9')
				num[n++] = a[i];
			else
				spl[s++]=a[i];
		}
		
		for(int i=0;i<A;i++) {
			System.out.print(alp[i]+" ");
		}
		for(int i=0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
		for(int i=0;i<s;i++) {
			System.out.print(spl[i]+" ");
		}
	}
}
