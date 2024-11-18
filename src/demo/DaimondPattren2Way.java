

package demo;

public class DaimondPattren2Way {

	public static void main(String[] args) {

//		    * 
//        *   * 
//      *       *                   
//    *           * 
//  *               * 
//*                   * 
//  *               * 
//    *           * 
//      *       * 
//        *   * 
//          * 

		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s <= 5 - i; s++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == i * 2 || j == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				if (j == i - 1 || j == 7)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {
			for (int s = 1; s <= 5 - i; s++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == i * 2 || j == 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {
				if (j == i - 1 || j == 7)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}
}
