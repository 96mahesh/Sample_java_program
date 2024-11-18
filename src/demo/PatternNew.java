package demo;

public class PatternNew {

	public static void main(String[] args) {
		for(int a=1;a<=8;a++) {
			for(int b=1;b<=9;b++) {
				if(b==5&&a<8 || a==8&(b>1&&b<5)|| b==1&&(a>5&&a<8) ||a==1)
				System.out.print("& ");
				else
					System.out.print("  ");
				
		}
			System.out.println();
	}
	}
}
