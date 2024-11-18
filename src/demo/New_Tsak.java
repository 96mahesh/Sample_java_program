package demo;

public class New_Tsak {

	public static void main(String[] args) {
		String name = "hyderabad234    is  a  big  city";		
		char a[] = name.toCharArray();
		String x =" ";
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z' || a[i]>='0' && a[i]<='9') {
				x+= String.valueOf(a[i]);	
			}
			else {
				if(a[i-1]>='a' && a[i-1]<='z'|| a[i-1]>='0' && a[i-1]<='9') {
					x+=' ';
				}
			}
			
		}
		System.out.println(x);
	}
}
