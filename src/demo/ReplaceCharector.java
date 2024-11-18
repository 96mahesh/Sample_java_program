package demo;

public class ReplaceCharector {

	public static void main(String[] args) {
		
		String name = "maheshbabu";		
		char a[] = name.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a')
				a[i]='i';
			
			System.out.print(a[i]);
		}
		
//		int pos = 3;
//		char rep = 'i';
//		String x =  name.substring(0,pos);
//		System.out.println(x);
//		x=name.substring(pos+1);
//		System.out.println(x);
		
		
		//System.out.println(name.replace("e", "i"));
	}
}
