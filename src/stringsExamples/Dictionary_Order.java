package stringsExamples;

import java.util.Scanner;

public class Dictionary_Order {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter value");
	        String line = scanner.nextLine();
	        int k = scanner.nextInt();
	        String minSubstring = line.substring(0,k);
	        String maxSubstring = line.substring(0,k);
	        for (int i = 1; i < line.length()-k+1; i++) {
	            String sub = line.substring(i,i+k);
	            System.out.println(sub);
	            if (sub.compareTo(minSubstring) < 0) {
	                minSubstring = sub;
	            }
	            if (sub.compareTo(maxSubstring) > 0) {
	                maxSubstring = sub;
	            }
	        }
	        System.out.println(minSubstring+" ");
	        System.out.println(maxSubstring+" ");
	        scanner.close();
	    }



}

	 
	


