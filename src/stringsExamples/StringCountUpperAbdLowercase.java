package stringsExamples;

public class StringCountUpperAbdLowercase {

	public static void main(String[] args) {
		
		String name = "JavA5is&Sub6p%eR"; //4 8 2 2 
		int uppercount = 0;
		int lowercount = 0;
		int numcount = 0;
		int splcount = 0;
	    char a[] =  name.toCharArray();
	    for (char c : a) {
			if(Character.isUpperCase(c))
				uppercount++;
			else if(Character.isLowerCase(c))
				lowercount++;
			else if(Character.isDigit(c))
				numcount++;
			else
				splcount++;
			
				
		}
	    
	    System.out.println(uppercount);
	    System.out.println(lowercount);
	    System.out.println(numcount);
	    System.out.println(splcount);
	    
	}
}
