package demo;

public class LambaconaPattren {

	public static void main(String[] args) {
		
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            
            System.out.println();
        }
        
        for (int i = 1; i <= 7; i++) {
            for (int j = i+1; j <= 7; j++) {
                System.out.print("*  ");
            }
            
            System.out.println();
        }
        
        System.out.println();
        
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            
            System.out.println();
        }
        
        for (int i = 1; i <= 7; i++) {
            for (int j = i+1; j <= 7; j++) {
                System.out.print("*  ");
            }
            
            System.out.println();
        }
	}
}
//int spaces = 2 * (7 - i);
//for (int j = 1; j <= spaces; j++) {
//    System.out.print(" ");
//}