package demo;

public class AssignmentByPaparao {

	public static void main(String[] args) {
		String name = "hyderabad----is--a--big--city";
		
		char a[] = name.toCharArray();
		String res = "";
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z') {
				res = res+a[i];
			}
			else {
				if(a[i-1]>='a' && a[i+1]<='z')
					res = res+" ";
			}
		}

		System.out.println(res);
	}
	}
