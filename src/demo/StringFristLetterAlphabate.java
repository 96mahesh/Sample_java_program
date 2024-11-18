package demo;

public class StringFristLetterAlphabate {

	public static void main(String[] args) {
		String name = "mahesh";
		char a[]  = name.toCharArray();
		char uni[] = new char[a.length] , u=0;
		for(int i=0;i<a.length;i++) {
			if(u==0) {
			char ch = a[i];
			String y = String.valueOf(ch).toUpperCase();
			ch = y.charAt(0);
			uni[u++] = ch;
			}
			else {
				uni[u++] = a[i];
				if(a[i]==' ')
				uni[u++] =  a[i];	
				break;
			}
		}
		for(int i=0;i<u;i++)
			System.out.println(uni[i]);
	}
	 
}
