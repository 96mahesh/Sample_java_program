package demo;

public class Dymand_Pattren {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int s=i;s<5;s++) {
				System.out.print("  ");
			}
			for(int j=0;j<=2*i;j++) {
				if(j==0 || j==2*i)
				System.out.print("❤️ ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int s=1;s<=i;s++) {
				System.out.print("  ");
			}
			for(int j=2*i;j<=10;j++) {
				if(j==2*i || j==10)
				System.out.print("❤️ ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}
