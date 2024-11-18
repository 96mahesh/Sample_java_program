package stringsExamples;

import java.util.Scanner;

public class RemovieDuplicatesEachWorld {

	public static void main(String[] args) {
		
//		Goodbye bye bye world world world
//		Sam went went to to to his business
//		Reya is is the the best player in eye eye game
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Emter String value");
		String name = scan.nextLine();
		String a[] = name.split(" ");
		String word="";
		String res = "";
		String x = "";
		for(int i=0;i<a.length;i++) {
			word = a[i];
			char ch[] = word.toCharArray();
			char uni[] = new char[ch.length];
			int u = 0;
			for(int j=0;j<ch.length;j++) {
				if(u == 0) {
					uni[u++] = ch[j];
				}
				else {
					int find = 0;
					for(int k=0;k<u;k++)
						if(uni[k] == ch[j])
							find++;
					if(find == 0) {
						uni[u++] = ch[j];
						x = String.valueOf(u);
					}
				}
				
			}
			
			x = x+" ";
			for (char c : uni) {
				System.out.print(c);
			}
			
		}

		
		//System.out.print(res);
		scan.close();
	}
}
