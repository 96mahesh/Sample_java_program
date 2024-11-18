package demo;

import java.util.Random;

public class GenarateRandomnumbers {

	public static void main(String[] args) {
		
		// Aproch 1
		Random rand = new Random();
		long rand_int = rand.nextLong(485683566745L);
		System.out.println(rand_int);
		
		double rand_dbl = rand.nextDouble();
		System.out.println(rand_dbl);
		
		//Aproch 2
		
		System.out.println(Math.random());
		
		//Aproch 3 ---Apache commons-lang Api;
		
		
		
	}
}
