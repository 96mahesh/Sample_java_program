package stringsExamples;

public class RemoveFileFormate {

	public static void main(String[] args) {
		
		String name = "Pancard.png";
	    
		String res = name.substring(name.lastIndexOf("."), name.length());
		System.out.println(res);
	}
}
