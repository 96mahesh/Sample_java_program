package demo;

public class CountOccurance {

	public static void main(String[] args) {
		
		String name = "Mahesh";
		String c = "h";
        int count = 0;
        
        for(int i=0;i<name.length();i++) {
        	for (int j=0;j<c.length();j++) {
        		if(name.charAt(i) == c.charAt(j))
        			count++;
        	}
        }
        
        System.out.println(c +" : "+"count value is : "+count);
	}

}
