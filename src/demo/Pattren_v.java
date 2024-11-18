package demo;

public class Pattren_v {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {                //i=1;i<=5;i++
			for(int s=1;s<=i;s++) {             //1<=5 t s=1 s<1;s++
				System.out.print(" ");     	   //1<1 f 
			}
			for(int j=i;j<=7;j++) {
				if(j==i || j==7)
				System.out.print("* ");
				else 
					System.out.print("  ");
			}
			
			for (int k=0;k<=13;k++) {
				if(k==1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
	}
}
