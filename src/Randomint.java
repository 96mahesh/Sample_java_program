import java.util.Random;

public class Randomint
{

	public static void main(String[] args) {
		 Random rand = new Random();
		  
	        // Generate random integers in range 0 to 999
	        int rand_int1 = rand.nextInt(1999929998);
	        int rand_int2 = rand.nextInt(1000);
	  
	        // Print random integers
	        System.out.println("Random Integers: "+rand_int1);
	        System.out.println("Random Integers: "+rand_int2);
	  
	        // Generate Random doubles
	        double rand_dub1 = rand.nextDouble();
	        double rand_dub2 = rand.nextDouble();
	  
	        // Print random doubles
	        System.out.println("Random Doubles: "+rand_dub1);
	        System.out.println("Random Doubles: "+rand_dub2);
	}
}
