package ArraysExample;

public class RemovieDuplicatesIntegerArray2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,1,1,5,4,5,3,5};
		
		int uni[] = new int[a.length], u=0;
		int cou[] = new int[a.length], c=0;
		
		for(int i=0;i<a.length;i++) {
			int count = 0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j])
					count++;
			}
			if(u==0) {
				uni[u++] = a[i];
				cou[c++] = count;
			}
			
			else {
				int find = 0;
				for(int k=0;k<u;k++)
					if(uni[k]==a[i])
						find++;
				
				if(find==0) {
					uni[u++] = a[i];
					cou[c++] = count;
				}
			}		
	  }
	   for(int i=0;i<u;i++) {
		   if(cou[i]!=1)
		   System.out.println(uni[i]+" ");
		   
	   }
	}
}
