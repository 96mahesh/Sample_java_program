
package stringsExamples;

public class MovieCharAfter5Letters {

	public static void main(String[] args) {
		
		String name = "Earth is the third planet from the sun and the only astronomical object known to harbour and support life.";
		
		char a[] = name.toCharArray();
		String res = "";
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==' ') {
				res = res+a[i];
			}
			else {
				res = res+((char) (a[i]+5));
			}
		}
		System.out.println(res);
	}
}
