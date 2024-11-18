package demo;

public class EligbleVoteOrnot {

	public static void main(String[] args) {

		int age = 25;

		switch (age) {

		case 17:
			System.out.println("The person not eligble for vote and marrage");
			break;

		case 20:
			System.out.println("The person  eligble for vote and not eligble for marrage");
			break;

		default:
			System.out.println("The person eligble for vote and marrage");

		}

	}
}
