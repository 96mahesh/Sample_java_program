package demo;

public class InterView_BraceProgram {

	public static void main(String[] args) {
		
		String n = "{{}}}}";  //{{{}}};
	    
		char a[] = n.toCharArray();
		
		char uni[] = new char[a.length];
		int u = 0;
		int cou[] = new int[a.length],c = 0;
		
		for(int i=0;i<a.length;i++) {
			 int count = 0;
			 for(int j=0;j<a.length;j++) {
				 if(a[i]==a[j])
					 count++;
			 }
			 
			 if(u==0) {
				 uni[u++]=a[i];
				 cou[c++]=count;
			 }
			 else {
				 int f = 0;
				 for(int k=0;k<u;k++)
					 if(uni[k]==a[i])
						 f++;
				 
				 if(f==0) {
					 uni[u++]=a[i];
					 cou[c++]=count;
				 }
			 }
		}
		int x = 0;
		for(int i=0;i<u;i++) {
			//System.out.println(uni[i]+" "+cou[i]);
			if(a.length/2<cou[i]) {
				x = (a.length-cou[i])/2;
				System.out.println("x value is : "+x);
			}
		}
		for(int i=0;i<u;i++) {
			if(a.length/2<cou[i]) {
				cou[i] = cou[i]-x;
				System.out.println("One value is : "+cou[i]);
			}
			else {
				cou[i] = cou[i]+x;
				System.out.println("One value is : "+cou[i]);
			}
			}
		
		for(int i=0;i<u;i++) {
			
			for(int j=0;j<cou[i];j++) {
				System.out.print(uni[i]);
			}
		}
				
		}
		
	}

