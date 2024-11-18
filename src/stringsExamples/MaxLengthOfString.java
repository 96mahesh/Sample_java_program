package stringsExamples;


public class MaxLengthOfString {

	public static void main(String[] args) {
		String name = "hello how are you mooooommmmm";
		String a[] = name.split(" ");
		String maxlength = a[0];
		for(int i=0;i<a.length;i++) {
	     if(maxlength.length()<a[i].length())
	    	 maxlength = a[i];
		}
		System.out.println(maxlength);
		minLengthOfString.main();
		maxLength.m(args);
	}
}

class minLengthOfString {
	
	public static void main() {
		String name = "hello how are you reddy";
		String a[] = name.split(" ");
		String minlength = a[0];
		
		for(int j=0;j<a.length;j++) {
			if(minlength.length()>a[j].length())
				minlength = a[j];
		}
		
		System.out.println(minlength);
	}
}


class maxLength{
	public static void m(String[] args) {
		
		String name = "Python Javascript Java SpringBoot";
		String a[] = name.split(" ");
		String max_length = a[0];
		
		for (String c : a) {
			if(max_length.length()<c.length())
				max_length = c;
		}
		
		System.out.println(max_length);
	}
}