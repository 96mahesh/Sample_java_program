package ArraysExample;

public class MaximumNumber {

	public static void main(String[] args) {
		
		int a[] = {2,5,1,9,6};
		int max = a[0];
		int x = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];	
			      x = i; 
			}
		}
			System.out.println(max+" "+x);
		
		
		int b[] =  {2,5,1,9,6 };
		int max1 = a[0];
		int index = 0;
		for (int i = 0; i < b.length; i++) {		
			if (max1 < a[i]) 
			{
				max1 = a[i];
				index = i;
			}
		}
		System.out.println(max1+" "+ index);
			
		System.out.println("==================");
		
		
			
			String c[] = {"coffe","chai","water","Dait Cocke"};
			String value = "";	
//			for (String s : c) {
//				if(s.length()<max) {
//					max = s.length();
//					value = s;
//				}
//			}	
			int y = 0;
			for(int i=0;i<c.length;i++) {
				if(c[i].length()>max) {
					max = c[i].length();
					y = i;
					value = c[i];
					
				}
			}
			System.out.println(value+" "+max+" "+y);
			
		}
	}
	
	

