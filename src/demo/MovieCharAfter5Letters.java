package demo;

public class MovieCharAfter5Letters {

	public static void main(String[] args) {
		 String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
         
		 String res = "";
		 
		 for(int i=0;i<name.length();i++) {
			  char c  = name.charAt(i);
			  if(c==' ') {
				  res = res+c;
			  }
			  else 
				  res = res+(char) (c+5);
		 }
		System.out.println(res);
		System.out.println();
		charOperat0r.main();
		System.out.println();
		ChangeCharPosition.Char();
		 
	}
}

class charOperat0r{
	public static void main() {
		 String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
        
		 StringBuilder res = new StringBuilder();
		 
		 for(int i=0;i<name.length();i++) {
			  char c  = name.charAt(i);
			  if(c==' ') {
				  res.append(c);
			  }
			  else 
				  res.append((char) (c+5));
		 }
		System.out.println(res);
}
}

class ChangeCharPosition{
	public static void Char() {
		 String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
        
		 char a[] = name.toCharArray();
		 String res = "";
		 
		 for(int i=0;i<a.length;i++) {
			 
			  if(a[i]==' ') {
				  res = res+a[i];
			  }
			  else 
				  res = res+(char) (a[i]+5);
		 }
		System.out.println(res);
			 
	}
}


//String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
//char a[] = name.toCharArray();
//
//char res [] = new char[a.length],u=0;
//
//
//for(int i=0;i<a.length;i++) {
//	 if(i==' ')
//		res[u++] = a[i] ;
//	 else
//		 res[u++] =  (char) ((char)a[i]+5);
//}
//
//System.out.println(res);