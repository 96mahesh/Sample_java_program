import java.util.*;

public class Consecutive_odd_numbers {

	public static void main(String[] args) {
		
		int a = 60, b = 100;
		int x = 0;
		if(a>0 && b>0 && a>b/2) {
			b/=2;
			while (b<=a) {
				if(b%2!=0) {
					x  = b;
				
				if(x+2<=a)
					System.out.println(x+","+(x+2));
			}
				b++;
			}
			
		}
		odd_consecutive.main(args);
	}
}

class odd_consecutive{
	
	public static void main(String[] args) {
		
		int a = 60, b = 100;
		int x = 1;
		 List<int[]> res = new ArrayList<>();
		 
		 while(x+2<a) {
			 if(x+(x+2)>b)
				 res.add(new int[] {x, x+2});
			 
			 x += 2;
		 }

		 for (int[] pair : res) {
			 System.out.println("(" + pair[0] + ", " + pair[1] + ")");
		}
	}
}