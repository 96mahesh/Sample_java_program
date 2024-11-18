package stringsExamples;

public class StringTokens {

	public static void main(String[] args) {
		
		String S = "He is a very very good boy, isn't he?";
		
		String a[] = S.split("[^A-Za-z]");
		int count = 0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[i]==a[j])
				count++;
				break;
			}
		}
		
		System.out.println(count);
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>=0)
			System.out.println(a[i]);
		}
	}
}
