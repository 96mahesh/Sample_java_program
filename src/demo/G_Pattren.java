package demo;

public class G_Pattren {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=15;j++) {
				if(i==1&&j<6&&j>1||j==1&&i>1&&i<5)
				System.out.print("* ");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
	}
}

