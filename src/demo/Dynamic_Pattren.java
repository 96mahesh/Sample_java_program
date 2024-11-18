package demo;

public class Dynamic_Pattren {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			for(int s=i;s<7;s++) {
				System.out.print(".");
			}
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i)
				System.out.print("🕊️ ");   
				
				else 
					System.out.print(", ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=7;i++) {                //i=1;i<=5;i++
			for(int s=1;s<i;s++) {             //1<=5 t s=1 s<1;s++
				System.out.print(" ");     	   //1<1 f 
			}
			for(int j=i;j<=7;j++) {
				if(j==i || j==7)
				System.out.print("🕊️ ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

