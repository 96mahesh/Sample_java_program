package demo;

public class CommonNameFind {

	public static void main(String[] args) {
		
		String a[] = {"mahesh" , "pawan"};
		String b[] = {"ram" , "mahesh"};
		String x = "";
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					x = a[i];
				}
			}
			
		}
		System.out.println(x);	
	}
	}

