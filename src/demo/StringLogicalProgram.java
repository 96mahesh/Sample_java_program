package demo;

public class StringLogicalProgram {

	public static void main(String[] args) {	
		String name = "aim1 big2 achive3";
		String a[] = name.split(" ");
		for(int i=0;i<a.length;i++) {
			String b = a[i];
			String c = b.substring(0,b.length()-1);
			String x = b.substring(c.length());
			int n=Integer.parseInt(x);
			for(int j=0;j<=n;j++) {
				System.out.println(c);
			}
			}
					
		}
	}



/*
*/