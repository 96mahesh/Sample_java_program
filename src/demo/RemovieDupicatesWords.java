package demo;

public class RemovieDupicatesWords {

	public static void main(String[] args) {
		String name = "Goodbye bye bye world world world";
		String a[] = name.split(" ");
		
		String uni[] = new String[a.length];
		int u = 0;
		
		for(int i=0;i<a.length;i++) {
		if(u==0) {
			uni[u++] = a[i];
			System.out.println(uni[i]);
		}
		else {
			int find = 0;
			for(int k=0;k<u;k++) 
				if(uni[k].equals(a[i]))
					find++;
				if(find == 0)	{
					uni[u++] = a[i];
				}
		}
		}
		
		for(int i=0;i<u;i++) {
			System.out.println(uni[i]);
		}
	}
	
}
