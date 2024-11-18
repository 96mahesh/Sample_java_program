public class Pattren {

	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++) {
			for(int j=1;j<=20;j++) {
				if((j==i || j==14-i) && i<8 && i>2 || i==3 && j<12 && j>2 || j==i+6 && i<6|| j==8-i && i<3|| i==5&&j>2&&j<10)
				System.out.print("* ");   
				
				else 
					System.out.print("  ");
			}
			
						System.out.println();
		}
	}
}

