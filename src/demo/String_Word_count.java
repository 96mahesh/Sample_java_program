package demo;

public class String_Word_count {

	public static void main(String[] args) {
		
		String name = "mahehs babu rampatruni selenium automation";
		
		String a[] = name.split(" ");
		int count = 0;
		for(int i=0;i<a.length;i++) {
			count = 1;
			for(int j=0;j<a.length;j++) {
				if(a[i]!=a[j])
					count++;
			}
		}
		System.out.println(count);
		countword.main();
		countwords.mainCount();
	}
}

class countword{
	public static void main() {
		
		String name = "Welcome to java selenium Automation Test Engineer";
		
		int count = 1;
		for(int i=0;i<name.length()-1;i++) {
			
			if((name.charAt(i)==' ') && (name.charAt(i+1)!=' '))
				count++;
		}
		
		System.out.println(count);
	}
}

class countwords{
	public static void mainCount() {
		
		String name = "Welcome to java selenium Automation Test Engineer";
		char a[] = name.toCharArray();
		int count = 1;
		for(int i=0;i<a.length;i++) {
			
			if((a[i]==' ') && (a[i+1]!=' '))
				count++;
		}
		
		System.out.println(count);
	}
}
