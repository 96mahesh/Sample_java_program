package ArraysExample;


public class demo {
	  public static void main(String[] args) {
	      String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
	      int maxLength = 0;
	      String longestString = "";
	      for (String s : toppings) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      System.out.format("longest string: '%s'\n", longestString);
	  }
}
