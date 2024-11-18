package demo;

public class AssinMent {

	public static void main(String[] args) {

		String str = "hi mahesh";
		String str2 = "mahesh";
		
		String a[] = str.split(" ");
		String b[] = str2.split(" ");
		String word ="";
		for(int i=0;i<a.length;i++) {
			String c = a[i];
			for(int j=0;j<b.length-1;j++) {
				String d = b[j];
				if(c.equals(d))
					word = c;
			}
		}
		System.out.println(word);
//		for(int i=0;i<a.length;i++) {
//			if(a[i].equals(word))
//				System.out.println(word);
//		}
		StringProgramm.main();
	}

}

class StringProgramm{
	public static void main() {

		String a[] = {"hi", "mahesh"};
		String b[] = {"mahesh"};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				String c = String.valueOf(b);
					if(a[i]==c)
						a[i] = "x";
				}
			}
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]=="x")
				System.out.println(a[i]);
		}
		}
		
	}


