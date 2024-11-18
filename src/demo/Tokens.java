package demo;


public class Tokens {
 
	public static void main(String[] args) {
		
		String S = "He is a very very good boy, isn't he?";
         String[] tokens = S.split("[^a-zA-Z]");
         int numTokens = 0;
        
         for (int i=0; i<tokens.length-1; i++) {
//             if (tokens[i].length() > 0) 
        	 
        	 for(int j=0;j<tokens.length;j++) {
        		 if(tokens[i]==tokens[j]) {
        			 numTokens++; 
        		 }
        	 }
         
        	 }
//                 numTokens++;
             
         System.out.println(numTokens);
        
         for (int i=0; i<tokens.length;++i)
             if (tokens[i].length() > 0)
                 System.out.println(tokens[i]);
         System.out.println("===============");
         StringTokens.main();
	}
}

class StringTokens{
	public static void main() {
       
		String s = "He is a very very good boy, isn't he?";
       
        // Write your code here.
        //s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }
}
