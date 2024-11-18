package demo;

public class ConwayFristStringToSecoundString {

	public static void main(String[] args) {
		
		String str = "india is greate"; //da s greate
		String str2 = "in";
		
		char a[] = str.toCharArray();
		char b[] = str2.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j])
					a[i]='x';
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!='x')
				System.out.print(a[i]);
		}
		
	}
}
